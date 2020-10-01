package br.com.infnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.model.negocio.Observador;
import br.com.infnet.model.service.ObservadorService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class ObservadorController {
	
	@Autowired private ObservadorService obsService;
	
	@ApiOperation(value = "Retornar uma lista de observadores")
	@GetMapping(value = "/observadores")
	public List<Observador> obterLista() {
		return obsService.obterLista();
		
	}
	
	@ApiOperation(value = "Retornar um observador")
	@GetMapping(value = "/observador/{id}")
	public Observador obterPorId(@PathVariable Integer id) {
		return obsService.obterPorId(id);
		
	}

	@ApiOperation(value = "Cadastrar um novo obesrvador")
	@PostMapping(value = "/observador/incluir")
	public void incluir(@RequestBody Observador observador) {
		obsService.incluir(observador);
		
	}
	
	@ApiOperation(value = "Excluir um observador existente")
	@DeleteMapping(value = "/observador/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		obsService.excluir(id);
		
	}

}
