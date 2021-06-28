package br.edu.fatec.service;

import java.util.List;

import br.edu.fatec.model.Curso;

public interface CursoService {
	
	void salvar(Curso Curso);
	
	void editar(Curso Curso);
	
	void excluir(Long id);
	
	Curso buscarPorId(Long id);
	
	List<Curso> buscarTodos();

}
