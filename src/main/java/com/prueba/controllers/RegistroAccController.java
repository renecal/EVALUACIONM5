package com.prueba.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
		return "nuevoregistro";
	}
	
}
