package br.edu.fatec.dao;

import java.util.List;

import br.edu.fatec.model.Disciplina;

public interface DisciplinaDao {
	
	void save(Disciplina Disciplina);
	
	void update(Disciplina Disciplina);
	
	void delete(Long id);
	
	Disciplina findById(Long id);
	
	List<Disciplina> findAll();

}
