package com.esanchez.devel.notifications.control.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.esanchez.devel.notifications.control.infrastructure.Constants;

@Controller
public class WebController {

	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("title", Constants.TITLE);
		model.addAttribute("version", Constants.VERSION);
		
		return "index";
	}
	
	@GetMapping("/main")
	public String main(Model model) {
		
		model.addAttribute("title", Constants.TITLE);
		model.addAttribute("version", Constants.VERSION);
		
		return "main";
	}
}
