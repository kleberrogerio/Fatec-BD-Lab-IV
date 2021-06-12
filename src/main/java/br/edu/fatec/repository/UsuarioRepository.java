package br.edu.fatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.fatec.model.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
