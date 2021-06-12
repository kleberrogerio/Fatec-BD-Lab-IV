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

import br.edu.fatec.model.Curso;
import br.edu.fatec.repository.CursoRepository;
import br.edu.fatec.service.CadastroCursoService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/cursos")
public class CursoController {
	
	private CursoRepository cursoRepository;
	private CadastroCursoService cadastroCursoService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Curso adicionar(@RequestBody Curso curso) {
		return cadastroCursoService.salvar(curso);
	}
	
	@GetMapping
	public List<Curso> Listar() {
		return cadastroCursoService.Listar();
	}
	
	@DeleteMapping("/{cursoId}")
	public ResponseEntity<Void> remover(@PathVariable Long cursoId){
		if(!cursoRepository.existsById(cursoId)) {
			return ResponseEntity.notFound().build();
		}
		
		cadastroCursoService.excluir(cursoId);
		
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/{cursoId}")
	public ResponseEntity<Curso> buscar(@PathVariable Long cursoId) {
		
		return cursoRepository.findById(cursoId)
				.map(ResponseEntity::ok)
			    .orElse(ResponseEntity.notFound().build());

	}
	
	@PutMapping("/{cursoId}")
	public ResponseEntity<Curso> atualizar(@PathVariable Long cursoId, @RequestBody Curso curso){
		if(!cursoRepository.existsById(cursoId)) {
			return ResponseEntity.notFound().build();
		}
		
		curso.setId(cursoId);
		curso = cadastroCursoService.salvar(curso);
		
		return ResponseEntity.ok(curso);
		
	} 

}
