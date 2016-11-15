package edu.mum.extra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.extra.entity.Project;
import edu.mum.extra.service.ProjectService;

@Controller
@RequestMapping("/tasks")
public class TasksController {
	
	@Autowired
	private ProjectService projectService;

	@RequestMapping(method=RequestMethod.GET)
	public String getTask(String id, Model model) {
		Project p = projectService.findById(Integer.parseInt(id));
		model.addAttribute("prj", p);
		return "tasks";
	}
	
}
