package edu.mum.extra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.extra.entity.Project;
import edu.mum.extra.entity.Status;
import edu.mum.extra.service.ProjectService;

@Controller
@RequestMapping("/projects")
public class ProjectsController {
	
	@Autowired
	private ProjectService projectService;

	@RequestMapping(method = RequestMethod.POST)
	public String create(Project project) {
		projectService.save(project);
		return "home";
	}
	
	@RequestMapping(method = RequestMethod.GET, value= "/all")
	public String getAll(Model model) {
		Iterable<Project> findAll = projectService.findAll();
		model.addAttribute("prjs", findAll);
		return "projects";
	}
	
	@RequestMapping(method = RequestMethod.GET, value= "/status")
	public String findProjectByStatus(Status status, Model model) {
		Iterable<Project> findAll = projectService.findByStatus(status);
		model.addAttribute("prjs", findAll);
		return "projects";
	}
	
	@RequestMapping(method = RequestMethod.GET, value= "/keyword")
	public String findProjectByKeyword(String keyword, Model model) {
		Iterable<Project> findAll = projectService.findByKeyword(keyword);
		model.addAttribute("prjs", findAll);
		return "projects";
	}
	
	@RequestMapping(method = RequestMethod.GET, value= "/skill")
	public String findProjectBySkill(String resource, Model model) {
		Iterable<Project> findAll = projectService.findByResource(resource);
		model.addAttribute("prjs", findAll);
		return "projects";
	}
}
