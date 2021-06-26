package br.edu.fatec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.fatec.model.Turma;
import br.edu.fatec.service.CadastroTurmaService;

@Controller
@RequestMapping("/turmas")
public class TurmaController {
	
	@Autowired
	private CadastroTurmaService service;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Turma turma) {
		return "/turma/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("turmas",service.Listar());
		return "/turma/lista";
	}
	@PostMapping("/salvar")
	public String salvar(Turma turma) {
		service.salvar(turma);
		return "redirect:/turmas/cadastrar";
		
	}

}
