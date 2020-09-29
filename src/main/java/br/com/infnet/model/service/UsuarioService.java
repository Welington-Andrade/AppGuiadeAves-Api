package br.com.infnet.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.model.negocio.Usuario;
import br.com.infnet.model.repository.IUsuarioRepository;


@Service
public class UsuarioService {
	
	@Autowired
	private IUsuarioRepository userRepository;

	public boolean isValid(String login, String senha) {		
		return userRepository.autenticacao(login, senha) != null;
	}
	
	public Usuario userExist(String login) {
		return userRepository.findByLogin(login);
	}
	
	public void incluir(Usuario usuario) {
		userRepository.save(usuario);
	}

}
