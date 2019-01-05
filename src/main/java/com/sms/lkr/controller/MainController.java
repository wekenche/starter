package com.sms.lkr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/",""})
public class MainController {

	
	@GetMapping
	public String home(Model model) {
		return "home";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/admin")
	public String admin() {
		return "admin/admin_list";
	}
	@GetMapping("/parents")
	public String parents() {
		return "parents/list";
	}
}
