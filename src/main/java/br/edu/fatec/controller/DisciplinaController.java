package br.edu.fatec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.fatec.model.Disciplina;
import br.edu.fatec.service.DisciplinaServiceImpl;

@Controller
@RequestMapping("/disciplinas")
public class DisciplinaController {
	
	@Autowired
	private DisciplinaServiceImpl service;
	
	
	@GetMapping("/cadastrar")
	public String cadastrar(Disciplina disciplina) {
		return "/disciplina/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/disciplina/lista";
	}
	
	
}	
	
