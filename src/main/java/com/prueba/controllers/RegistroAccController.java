package com.prueba.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prueba.entity.RegistroAccidente;
import com.prueba.interfaceService.IRegistroAccidenteService;

@Controller
@RequestMapping
public class RegistroAccController {

	@Autowired
	private IRegistroAccidenteService rAccService; 
	
	@GetMapping(value = "/hola")
	public String index(Model model) {
		model.addAttribute("titulo", "Hola SPF");
		return "index";
	}
	
	@GetMapping("/listar")
	public String listarRegistroAccidente(Model model) {
	    List<RegistroAccidente> regAccidente = rAccService.listarAccidente();
	    model.addAttribute("key", regAccidente);
	    return "index";
	} 
	
}
