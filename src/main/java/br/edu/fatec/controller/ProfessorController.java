package br.edu.fatec.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.edu.fatec.model.Professor;
import br.edu.fatec.repository.ProfessorRepository;
import br.edu.fatec.repository.UsuarioRepository;
import br.edu.fatec.service.CadastroProfessorService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/professores")
public class ProfessorController {
	
	private UsuarioRepository usuarioRepository;
	private ProfessorRepository professorRepository;
	private CadastroProfessorService cadastroProfessorService;

	@PostMapping("/{usuarioId}")
	public ResponseEntity<Professor> adicionar(@PathVariable Long usuarioId, @RequestBody Professor professor){
		if(!usuarioRepository.existsById(usuarioId)) {
			return ResponseEntity.notFound().build();
		}
		
		professor.setId(usuarioId);
		cadastroProfessorService.salvar(professor);
	   
		return ResponseEntity.ok(professor);
		
	} 
	
	@GetMapping
	public List<Professor> Listar() {
		return cadastroProfessorService.Listar();
	}
	
	@DeleteMapping("/{professorId}")
	public ResponseEntity<Void> remover(@PathVariable Long professorId){
		if(!professorRepository.existsById(professorId)) {
			return ResponseEntity.notFound().build();
		}
		
		cadastroProfessorService.excluir(professorId);
		
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/{professorId}")
	public ResponseEntity<Professor> buscar(@PathVariable Long professorId) {
		
		return professorRepository.findById(professorId)
				.map(ResponseEntity::ok)
			    .orElse(ResponseEntity.notFound().build());
	}
	
	@PutMapping("/{professorId}")
	public ResponseEntity<Professor> atualizar(@PathVariable Long professorId, @RequestBody Professor professor){
		if(!professorRepository.existsById(professorId)) {
			return ResponseEntity.notFound().build();
		}
		
		professor.setId(professorId);
		professor = cadastroProfessorService.salvar(professor);
		
		return ResponseEntity.ok(professor);	
	} 
}
