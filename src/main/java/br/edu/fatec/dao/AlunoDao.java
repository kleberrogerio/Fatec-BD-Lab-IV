package br.edu.fatec.dao;

import java.util.List;

import br.edu.fatec.model.Aluno;

public interface AlunoDao {
	
	void save(Aluno aluno);
	
	void update(Aluno aluno);
	
	void delete(Long id);
	
	Aluno findById(Long id);
	
	List<Aluno> findAll();

}
