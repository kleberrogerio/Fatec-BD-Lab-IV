package br.edu.fatec.dao;

import java.util.List;

import br.edu.fatec.model.Turma;

public interface TurmaDao {
	
	void save(Turma Turma);
	
	void update(Turma Turma);
	
	void delete(Long id);
	
	Turma findById(Long id);
	
	List<Turma> findAll();

}
