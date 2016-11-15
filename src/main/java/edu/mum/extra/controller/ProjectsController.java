package edu.mum.extra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.extra.entity.Project;
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
	
	@RequestMapping(method = RequestMethod.GET)
	public String getAll(Model model) {
		Iterable<Project> findAll = projectService.findAll();
		model.addAttribute("prjs", findAll);
		return "projects";
	}
}
