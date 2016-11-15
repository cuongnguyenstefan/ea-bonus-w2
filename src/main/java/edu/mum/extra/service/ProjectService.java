package edu.mum.extra.service;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.extra.dao.ProjectRepository;
import edu.mum.extra.entity.Project;

@Service
@Transactional
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public void save(Project project) {
		projectRepository.save(project);
	}
	
	public Iterable<Project> findAll() {
		Iterable<Project> findAll = projectRepository.findAll();
		for (Project p : findAll) {
			Hibernate.initialize(p.getBeneficiaries());
			Hibernate.initialize(p.getTasks());
			Hibernate.initialize(p.getPictures());
		}
		return findAll;
	}
}
