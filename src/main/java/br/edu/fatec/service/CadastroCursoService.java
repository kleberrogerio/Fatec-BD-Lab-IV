package br.edu.fatec.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.fatec.model.Curso;
import br.edu.fatec.repository.CursoRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CadastroCursoService {
	
private CursoRepository cursoRepository;
	
	@Transactional
	public Curso salvar(Curso curso) {
		return cursoRepository.save(curso);
	}
	
	public List<Curso> Listar() {
		return cursoRepository.findAll();
	}
	
	@Transactional
	public void excluir(Long cursoId) {
		cursoRepository.deleteById(cursoId);
	}

}
