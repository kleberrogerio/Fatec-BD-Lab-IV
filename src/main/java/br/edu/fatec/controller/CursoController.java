package br.edu.fatec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.fatec.model.Curso;
import br.edu.fatec.service.CadastroCursoService;

@Controller
@RequestMapping("/cursos")
public class CursoController {
	
	@Autowired
	private CadastroCursoService service;	
	
	@GetMapping("/cadastrar")
	public String cadastrar(Curso curso) {
		return "/curso/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("cursos",service.Listar());
		return "/curso/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(Curso curso) {
		service.salvar(curso);
		return "redirect:/cursos/cadastrar";
	}
	

} 