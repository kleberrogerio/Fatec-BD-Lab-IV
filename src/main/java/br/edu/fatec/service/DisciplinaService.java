package br.edu.fatec.service;

import java.util.List;

import br.edu.fatec.model.Disciplina;

public interface DisciplinaService {
	
	void salvar(Disciplina Disciplina);
	
	void editar(Disciplina Disciplina);
	
	void excluir(Long id);
	
	Disciplina buscarPorId(Long id);
	
	List<Disciplina> buscarTodos();

}
