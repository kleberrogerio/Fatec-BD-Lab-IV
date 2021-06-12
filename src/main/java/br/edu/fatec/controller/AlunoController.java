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

import br.edu.fatec.model.Aluno;
import br.edu.fatec.model.Professor;
import br.edu.fatec.repository.AlunoRepository;
import br.edu.fatec.repository.UsuarioRepository;
import br.edu.fatec.service.CadastroAlunoService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	private UsuarioRepository usuarioRepository;
	private AlunoRepository alunoRepository;
	private CadastroAlunoService cadastroAlunoService;

	@PostMapping("/{usuarioId}")
	public ResponseEntity<Aluno> adicionar(@PathVariable Long usuarioId, @RequestBody Aluno aluno){
		if(!usuarioRepository.existsById(usuarioId)) {
			return ResponseEntity.notFound().build();
		}
		
		aluno.setId(usuarioId);
		cadastroAlunoService.salvar(aluno);
	   
		return ResponseEntity.ok(aluno);
		
	} 
	
	@GetMapping
	public List<Aluno> Listar() {
		return cadastroAlunoService.Listar();
	}
	
	@DeleteMapping("/{alunoId}")
	public ResponseEntity<Void> remover(@PathVariable Long alunoId){
		if(!alunoRepository.existsById(alunoId)) {
			return ResponseEntity.notFound().build();
		}
		
		cadastroAlunoService.excluir(alunoId);
		
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/{alunoId}")
	public ResponseEntity<Aluno> buscar(@PathVariable Long alunoId) {
		
		return alunoRepository.findById(alunoId)
				.map(ResponseEntity::ok)
			    .orElse(ResponseEntity.notFound().build());
	}
	
	@PutMapping("/{alunoId}")
	public ResponseEntity<Aluno> atualizar(@PathVariable Long alunoId, @RequestBody Aluno aluno){
		if(!alunoRepository.existsById(alunoId)) {
			return ResponseEntity.notFound().build();
		}
		
		aluno.setId(alunoId);
		aluno = cadastroAlunoService.salvar(aluno);
		
		return ResponseEntity.ok(aluno);	
	} 

}
