package br.edu.fatec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/courses")
public class CourseController {
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/course/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/course/lista";
	}

}
