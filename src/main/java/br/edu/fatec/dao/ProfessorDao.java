package br.edu.fatec.dao;

import java.util.List;

import br.edu.fatec.model.Professor;

public interface ProfessorDao {
	
	void save(Professor Professor);
	
	void update(Professor Professor);
	
	void delete(Long id);
	
	Professor findById(Long id);
	
	List<Professor> findAll();

}
