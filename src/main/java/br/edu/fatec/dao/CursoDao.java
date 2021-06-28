package br.edu.fatec.dao;

import java.util.List;

import br.edu.fatec.model.Curso;

public interface CursoDao {
	
	void save(Curso Curso);
	
	void update(Curso Curso);
	
	void delete(Long id);
	
	Curso findById(Long id);
	
	List<Curso> findAll();

}
