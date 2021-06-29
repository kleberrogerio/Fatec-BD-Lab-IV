package br.edu.fatec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.fatec.model.Turma;
import br.edu.fatec.service.TurmaServiceImpl;

@Controller
@RequestMapping("/turmas")
public class TurmaController {
	
	@Autowired
	private TurmaServiceImpl service;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Turma turma) {
		return "/turma/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("turmas",service.buscarTodos());
		return "/turma/lista";
	}
	@PostMapping("/salvar")
	public String salvar(Turma turma) {
		service.salvar(turma);
		return "redirect:/turmas/cadastrar";
		
	}
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("turma",service.buscarPorId(id));
		return "/turma/cadastro";
	}
	
	@PostMapping("/editar")
	public String editar(Turma turma) {
		service.editar(turma);
		return "redirect:/turmas/cadastrar";
	}
	
	@GetMapping("excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		service.excluir(id);
		return listar(model);
	}

}
