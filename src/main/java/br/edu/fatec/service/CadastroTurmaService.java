package br.edu.fatec.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.fatec.model.Turma;
import br.edu.fatec.repository.TurmaRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CadastroTurmaService {
	
	private TurmaRepository turmaRepository;
	
	@Transactional
	public Turma salvar(Turma turma) {
		return turmaRepository.save(turma);
	}
	
	public List<Turma> Listar() {
		return turmaRepository.findAll();
	}
	
	@Transactional
	public void excluir(Long turmaId) {
		turmaRepository.deleteById(turmaId);
	}
}
