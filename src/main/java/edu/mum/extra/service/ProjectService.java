package edu.mum.extra.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.extra.dao.ProjectRepository;
import edu.mum.extra.entity.Project;
import edu.mum.extra.entity.Status;

@Service
@Transactional
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project findById(Integer id) {
		Project p = projectRepository.findOne(id);
		load(p);
		return p;
	}
	
	public void save(Project project) {
		projectRepository.save(project);
	}
	
	public Iterable<Project> findAll() {
		Iterable<Project> findAll = projectRepository.findAll();
		load(findAll);
		return findAll;
	}
	
	public Iterable<Project> findByStatus(Status status) {
		Iterable<Project> findAll = projectRepository.findByStatus(status);
		load(findAll);
		return findAll;
	}
	
	public Iterable<Project> findByKeyword(String keyword) {
		Iterable<Project> byDes = projectRepository.findByDesciptionLikeIgnoreCase("%" + keyword + "%");
		Iterable<Project> byLoc = projectRepository.findByLocation(keyword);
		List<Project> result = new ArrayList<Project>();
		byDes.forEach(p -> {
			result.add(p);
		});
		byLoc.forEach(p -> {
			if (!result.contains(p)) {
				result.add(p);
			}
		});
		load(result);
		return result;
	}
	
	public Iterable<Project> findByResource(String resource) {
		Iterable<Project> result = projectRepository.findByTasksResourcesResource(resource);
		load(result);
		return result;
	}
	
	public Iterable<Project> findByVolunteer(Integer id) {
		Iterable<Project> result = projectRepository.findDistinctByTasksVolunteerServicesUserUserId(id);
		load(result);
		return result;
	}
	
	private void load(Iterable<Project> result) {
		for (Project p : result) {
			load(p);
		}
	}
	private void load(Project p) {
			Hibernate.initialize(p.getBeneficiaries());
			Hibernate.initialize(p.getTasks());
			Hibernate.initialize(p.getPictures());
	}
}
