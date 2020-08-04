package com.prueba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping({"/", ""})
	public String panel(Model model) {		
		model.addAttribute("titulo", "Panel Sistema");
		return "index";
		
	}
}
