package edu.mum.extra;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.extra.entity.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		if (user != null) {
			model.addAttribute("user", user);
			return "home";
		}
		return "login";
	}

}
