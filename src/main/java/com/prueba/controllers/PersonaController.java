package com.prueba.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.prueba.entity.Persona;
import com.prueba.interfaceService.IPersonaService;

@Controller
public class PersonaController {

	@Autowired
	private IPersonaService persona;
	
	@GetMapping("")
	public String listarCliente(Model model) {
		List<Persona> listPer = persona.listarPersona();
		model.addAttribute("", listPer);
		return "pagina deseada";
	}
	
	@GetMapping("")
	public String addCliente(Model model) {
		model.addAttribute("persona", new Persona());
		return "pagina";
	}
	
	//@GetMapping("")
	public String guardarCliente(@Validated Persona p, Model model) {
		persona.save(p);
		return "redirect/";
	}
	
	//@GetMapping("pagina"/{id}")
	public String editarCliente(@PathVariable Long id, Model model) {
		Optional<Persona> perId = persona.listarPersonaId(id);
		model.addAttribute("persona", perId);
		return "pagina";
	}
	
	//@GetMapping("pagina"/{id}")
	public String delete(Model model, @PathVariable Long id) {
		persona.delete(id);
		return "redirect:/pagina";
	}
	

}
