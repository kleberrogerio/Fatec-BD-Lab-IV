package br.edu.fatec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/user/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/user/lista";
	}

}