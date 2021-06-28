package br.edu.fatec.service;

import java.util.List;

import br.edu.fatec.model.Aluno;

public interface AlunoService {
	
	void salvar(Aluno aluno);
	
	void editar(Aluno aluno);
	
	void excluir(Long id);
	
	Aluno buscarPorId(Long id);
	
	List<Aluno> buscarTodos();

}
