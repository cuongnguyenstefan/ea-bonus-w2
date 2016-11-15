package edu.mum.extra.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.mum.extra.entity.Project;
import edu.mum.extra.entity.Status;

public interface ProjectRepository extends CrudRepository<Project, Integer>{
	
	public List<Project> findByStatus(Status status);
	
	public List<Project> findByDesciptionLikeIgnoreCase(String keyword);
	
	public List<Project> findByLocation(String location);
	
	public List<Project> findByTasksResourcesResource(String resource);
	
	public List<Project> findDistinctByTasksVolunteerServicesUserUserId(Integer id);
}
