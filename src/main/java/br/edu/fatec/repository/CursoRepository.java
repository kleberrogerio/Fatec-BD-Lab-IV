package br.edu.fatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.fatec.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

}
