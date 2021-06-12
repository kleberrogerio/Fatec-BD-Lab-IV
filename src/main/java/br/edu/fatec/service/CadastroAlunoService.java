package br.edu.fatec.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.fatec.model.Aluno;
import br.edu.fatec.repository.AlunoRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CadastroAlunoService {
	
private AlunoRepository alunoRepository;
	
	@Transactional
	public Aluno salvar(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	public List<Aluno> Listar() {
		return alunoRepository.findAll();
	}
	
	@Transactional
	public void excluir(Long alunoId) {
		alunoRepository.deleteById(alunoId);
	}

}
