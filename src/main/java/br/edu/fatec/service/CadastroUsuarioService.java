package br.edu.fatec.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.edu.fatec.model.Usuario;
import br.edu.fatec.repository.UsuarioRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CadastroUsuarioService {
	
	private UsuarioRepository usuarioRepository;
	
	@Transactional
	public Usuario salvar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public List<Usuario> Listar() {
		return usuarioRepository.findAll();
	}
	
	@Transactional
	public void excluir(Long usuarioId) {
		usuarioRepository.deleteById(usuarioId);
	}

}
