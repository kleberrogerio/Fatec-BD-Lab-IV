package br.edu.fatec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/classes")
public class ClassController {
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/class/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/class/lista";
	}

}
