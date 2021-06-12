package br.edu.fatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.edu.fatec.model.Professor;


@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long>{
	
}
