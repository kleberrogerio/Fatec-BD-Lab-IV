package br.edu.fatec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.fatec.dao.CursoDao;
import br.edu.fatec.model.Curso;

@Service @Transactional(readOnly = false)
public class CursoServiceImpl implements CursoService {

	@Autowired
	private CursoDao dao;

	@Override
	public void salvar(Curso Curso) {
		dao.save(Curso);
	}

	@Override
	public void editar(Curso Curso) {
		dao.update(Curso);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public Curso buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Curso> buscarTodos() {
		return dao.findAll();
	}

}
