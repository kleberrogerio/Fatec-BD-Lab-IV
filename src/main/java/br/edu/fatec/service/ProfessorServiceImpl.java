package br.edu.fatec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.fatec.dao.ProfessorDao;
import br.edu.fatec.model.Professor;

@Service @Transactional(readOnly = false)
public class ProfessorServiceImpl implements ProfessorService {

	@Autowired
	private ProfessorDao dao;

	@Override
	public void salvar(Professor Professor) {
		dao.save(Professor);
	}

	@Override
	public void editar(Professor Professor) {
		dao.update(Professor);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public Professor buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Professor> buscarTodos() {
		return dao.findAll();
	}

}
