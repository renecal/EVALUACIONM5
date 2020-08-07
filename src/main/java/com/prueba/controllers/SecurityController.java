package com.prueba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

	@GetMapping({"/","/login"})
	public String index() {
		return "indexLogin";
	}
	
	@GetMapping("/panelGeneral")
	public String panel() {
		return "index";
	}
}
