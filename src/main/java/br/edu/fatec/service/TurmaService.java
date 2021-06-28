package br.edu.fatec.service;

import java.util.List;

import br.edu.fatec.model.Turma;

public interface TurmaService {
	
	void salvar(Turma Turma);
	
	void editar(Turma Turma);
	
	void excluir(Long id);
	
	Turma buscarPorId(Long id);
	
	List<Turma> buscarTodos();

}
