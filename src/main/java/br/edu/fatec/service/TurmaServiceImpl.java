package br.edu.fatec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.fatec.dao.TurmaDao;
import br.edu.fatec.model.Turma;

@Service @Transactional(readOnly = false)
public class TurmaServiceImpl implements TurmaService {

	@Autowired
	private TurmaDao dao;

	@Override
	public void salvar(Turma Turma) {
		dao.save(Turma);
	}

	@Override
	public void editar(Turma Turma) {
		dao.update(Turma);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public Turma buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Turma> buscarTodos() {
		return dao.findAll();
	}

}
