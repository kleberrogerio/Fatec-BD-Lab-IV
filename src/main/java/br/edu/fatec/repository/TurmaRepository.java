package br.edu.fatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.fatec.model.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {

}
