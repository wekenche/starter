package com.sms.lkr.controller.parents;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/parents")
public class ParentsController {
	
	@GetMapping("/add")
	public String parents(Model model) {
		model.addAttribute("data","this is data from server!");
		return "parents/list";
	}
}
