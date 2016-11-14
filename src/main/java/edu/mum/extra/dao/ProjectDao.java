package edu.mum.extra.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.mum.extra.entity.Project;
import edu.mum.extra.entity.Status;
import edu.mum.extra.entity.User;

public interface ProjectDao extends CrudRepository<Project, Integer>{
	
	public boolean createProject(User creator, Project project);
	
	public List<Project> findByStatus(Status status);
	
	public List<Project> findByDesciptionLikeIgnoreCase(String keyword);
	
	public List<Project> findByLocation(String location);
}
