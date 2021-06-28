package br.edu.fatec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.fatec.dao.DisciplinaDao;
import br.edu.fatec.model.Disciplina;

@Service @Transactional(readOnly = false)
public class DisciplinaServiceImpl implements DisciplinaService {

	@Autowired
	private DisciplinaDao dao;

	@Override
	public void salvar(Disciplina Disciplina) {
		dao.save(Disciplina);
	}

	@Override
	public void editar(Disciplina Disciplina) {
		dao.update(Disciplina);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public Disciplina buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Disciplina> buscarTodos() {
		return dao.findAll();
	}

}
