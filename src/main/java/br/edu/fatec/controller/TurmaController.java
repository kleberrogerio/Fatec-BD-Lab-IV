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
import br.edu.fatec.model.Turma;
import br.edu.fatec.repository.TurmaRepository;
import br.edu.fatec.service.CadastroTurmaService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/turmas")
public class TurmaController {
	
	private TurmaRepository turmaRepository;
	private CadastroTurmaService cadastroTurmaService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Turma adicionar(@RequestBody Turma turma) {
		return cadastroTurmaService.salvar(turma);
	}
	
	@GetMapping
	public List<Turma> Listar() {
		return cadastroTurmaService.Listar();
	}
	
	@DeleteMapping("/{turmaId}")
	public ResponseEntity<Void> remover(@PathVariable Long turmaId){
		if(!turmaRepository.existsById(turmaId)) {
			return ResponseEntity.notFound().build();
		}
		
		cadastroTurmaService.excluir(turmaId);
		
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/{turmaId}")
	public ResponseEntity<Turma> buscar(@PathVariable Long turmaId) {
		
		return turmaRepository.findById(turmaId)
				.map(ResponseEntity::ok)
			    .orElse(ResponseEntity.notFound().build());

	}
	
	@PutMapping("/{turmaId}")
	public ResponseEntity<Turma> atualizar(@PathVariable Long turmaId, @RequestBody Turma turma){
		if(!turmaRepository.existsById(turmaId)) {
			return ResponseEntity.notFound().build();
		}
		
		turma.setId(turmaId);
		turma = cadastroTurmaService.salvar(turma);
		
		return ResponseEntity.ok(turma);
		
	} 

}
