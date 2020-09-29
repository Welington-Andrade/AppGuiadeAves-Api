package br.com.infnet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.model.negocio.Usuario;
import br.com.infnet.model.service.UsuarioService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class UsuarioController {
	
	@Autowired 
	private UsuarioService userService;

	@ApiOperation(value = "Cadastrar um usuário")
	@PostMapping(value = "/usuario/incluir")
	public void incluir(@RequestBody Usuario usuario) {
		userService.incluir(usuario);
	}

	@ApiOperation(value = "Autentica o usuário")
	@PostMapping(value = "/usuario")
	public boolean isValid(@RequestParam String login, @RequestParam String senha) {		
		return userService.isValid(login, senha);
	}
	
	@ApiOperation(value = "Retorna o usuário pelo login")
	@PostMapping(value = "/usuario/{login}")
	public Usuario userExist(@PathVariable String login) {
		return userService.userExist(login);
	}
}