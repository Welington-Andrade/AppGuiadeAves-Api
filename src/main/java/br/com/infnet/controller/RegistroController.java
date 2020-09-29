package br.com.infnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.model.negocio.Registro;
import br.com.infnet.model.service.RegistroService;

@RestController
@RequestMapping("/api/registro")
public class RegistroController {
	
	@Autowired private RegistroService regService;
	
	@GetMapping(value = "/lista")
	public List<Registro> obterLista() {
		return regService.obterLista();
	}

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Registro registro) {
		regService.incluir(registro);
	}

	@GetMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		regService.excluir(id);
	}

	@GetMapping(value = "/{id}/consultar")
	public Registro consultar(@PathVariable Integer id) {
		return regService.obterPorId(id);
	}

}
