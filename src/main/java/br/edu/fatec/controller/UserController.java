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
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private CadastroUsuarioService service;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Usuario usuario) {
		return "/user/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("usuarios",service.Listar());
		return "/user/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(Usuario usuario) {
		service.salvar(usuario);
		return "redirect:/users/cadastrar";
		
	}

}
