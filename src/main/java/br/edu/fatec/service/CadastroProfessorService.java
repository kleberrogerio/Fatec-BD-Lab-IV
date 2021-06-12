package br.edu.fatec.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import br.edu.fatec.model.Professor;
import br.edu.fatec.repository.ProfessorRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CadastroProfessorService {
	
	private ProfessorRepository professorRepository;
	
	@Transactional
	public Professor salvar(Professor professor) {
		return professorRepository.save(professor);
	}
	
	public List<Professor> Listar() {
		return professorRepository.findAll();
	}
	
	@Transactional
	public void excluir(Long professorId) {
		professorRepository.deleteById(professorId);
	}
}
