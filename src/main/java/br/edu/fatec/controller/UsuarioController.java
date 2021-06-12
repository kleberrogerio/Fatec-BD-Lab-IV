package br.edu.fatec.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatec.model.Usuario;
import br.edu.fatec.repository.ProfessorRepository;
import br.edu.fatec.repository.UsuarioRepository;
import br.edu.fatec.service.CadastroProfessorService;
import br.edu.fatec.service.CadastroUsuarioService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	private UsuarioRepository usuarioRepository;
	private ProfessorRepository professorRepository;
	private CadastroUsuarioService cadastroUsuarioService;
	private CadastroProfessorService cadastroProfessorService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario adicionar(@RequestBody Usuario usuario) {
		return cadastroUsuarioService.salvar(usuario);
	}
	
	@GetMapping
	public List<Usuario> Listar() {
		return cadastroUsuarioService.Listar();
	}
	
	@DeleteMapping("/{usuarioId}")
	public ResponseEntity<Void> remover(@PathVariable Long usuarioId){
		if(!usuarioRepository.existsById(usuarioId)) {
			return ResponseEntity.notFound().build();
		}
		
		if(professorRepository.existsById(usuarioId)) {
			cadastroProfessorService.excluir(usuarioId);
		}
		
		cadastroUsuarioService.excluir(usuarioId);
		
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/{usuarioId}")
	public ResponseEntity<Usuario> buscar(@PathVariable Long usuarioId) {
		
		return usuarioRepository.findById(usuarioId)
				.map(ResponseEntity::ok)
			    .orElse(ResponseEntity.notFound().build());

	}
	
	@PutMapping("/{usuarioId}")
	public ResponseEntity<Usuario> atualizar(@PathVariable Long usuarioId, @RequestBody Usuario usuario){
		if(!usuarioRepository.existsById(usuarioId)) {
			return ResponseEntity.notFound().build();
		}
		
		usuario.setId(usuarioId);
		usuario = cadastroUsuarioService.salvar(usuario);
		
		return ResponseEntity.ok(usuario);
		
	} 
	

}
