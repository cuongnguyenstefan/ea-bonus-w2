package edu.mum.extra.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.extra.entity.Project;
import edu.mum.extra.entity.Service;
import edu.mum.extra.entity.Task;
import edu.mum.extra.entity.User;
import edu.mum.extra.service.ProjectService;
import edu.mum.extra.service.TaskService;
import edu.mum.extra.service.UserService;

@Controller
@RequestMapping("/volunteers")
public class VolunteerController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private TaskService taskService;
	
	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String volunteer(String taskId, HttpServletRequest req) {
		User user = (User) req.getSession().getAttribute("user");
		User get = userService.get(user.getUserId());
		Task task = taskService.get(Integer.parseInt(taskId));
		Service s = new Service();
		s.setTask(task);
		s.setUser(get);
		get.getServices().add(s);
		userService.saveUser(get);
		return "home";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/search")
	public String search(String id, Model model) {
		Iterable<Project> findAll = projectService.findByVolunteer(Integer.parseInt(id));
		model.addAttribute("prjs", findAll);
		return "projects";
	}
}
