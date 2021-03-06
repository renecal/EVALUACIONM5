package com.prueba.controllers;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.prueba.entity.RegistroAccidente;
import com.prueba.entity.TipoAccidente;
import com.prueba.interfaceService.IRegistroAccidenteService;
import com.prueba.interfaceService.ITipoAccidenteService;

@Controller
@RequestMapping("/registros")
public class RegistroAccController {

	@Autowired
	private IRegistroAccidenteService rAccService; 
	@Autowired
	private ITipoAccidenteService tipoAccidenteService;
	

	
	@GetMapping("/listar")
	public String listarRegistroAccidente(Model model) {
	    List<RegistroAccidente> regAccidente = rAccService.listarAccidente();
	    model.addAttribute("key", regAccidente);
	    
	    	return "registrosaccidente";
	} 
	
	@GetMapping("/nuevo")
	public String agregarRegistroAccidente(Model model) {
		List<TipoAccidente> tiposAccidentes = tipoAccidenteService.listarTipoAccidente();
		model.addAttribute("title", "Nuevo Registro de Accidente");
		model.addAttribute("tiposAccidentes", tiposAccidentes);
		 model.addAttribute("RegistroModelo", new RegistroAccidente());
		return "nuevoregistro";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST )
	public String procesarRegistroAccidente(@ModelAttribute("registroModelo") RegistroAccidente regAccidente, Model model) {
		regAccidente = rAccService.save(regAccidente);
		return agregarRegistroAccidente(model);
	}
	
}
