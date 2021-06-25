package br.edu.fatec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.fatec.model.Usuario;
import br.edu.fatec.service.CadastroUsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private CadastroUsuarioService service;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Usuario usuario) {
		return "/usuario/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("usuarios",service.Listar());
		return "/usuario/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(Usuario usuario) {
		service.salvar(usuario);
		return "redirect:/usuarios/cadastrar";
		
	}

}
