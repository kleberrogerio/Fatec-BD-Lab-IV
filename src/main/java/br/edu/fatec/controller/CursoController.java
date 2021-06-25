package br.edu.fatec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cursos")
public class CursoController {
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/curso/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/curso/lista";
	}

}
