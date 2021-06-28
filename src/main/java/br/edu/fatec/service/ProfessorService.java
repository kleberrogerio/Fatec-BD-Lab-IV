package br.edu.fatec.service;

import java.util.List;

import br.edu.fatec.model.Professor;

public interface ProfessorService {
	
	void salvar(Professor Professor);
	
	void editar(Professor Professor);
	
	void excluir(Long id);
	
	Professor buscarPorId(Long id);
	
	List<Professor> buscarTodos();

}
