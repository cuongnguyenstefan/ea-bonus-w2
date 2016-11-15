package edu.mum.extra.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.extra.entity.User;
import edu.mum.extra.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(User user, Model model, HttpServletRequest request) {
		User findOne = loginService.login(user);
		if (findOne != null) {
			model.addAttribute("user", findOne);
			request.getSession().setAttribute("user", findOne);
			return "home";
		}
		return "login";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest req) {
		req.getSession().removeAttribute("user");
		return "login";
	}

}
