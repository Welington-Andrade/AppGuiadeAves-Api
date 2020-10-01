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

import br.com.infnet.model.negocio.Ave;
import br.com.infnet.model.service.AveService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class AveController {
	
	@Autowired private AveService aveService;
	
	@ApiOperation(value = "Cadastrar uma nova ave")
	@PostMapping(value = "/ave/incluir")
	public void incluir(@RequestBody Ave ave) {
		aveService.incluir(ave);
	}

	@ApiOperation(value = "Retornar uma lista de aves")
	@GetMapping(value = "/aves")
	public List<Ave> obterLista() {
		return aveService.obterLista();
	}
	@ApiOperation(value = "Remover uma ave existente")
	@DeleteMapping(value = "/ave/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		aveService.excluir(id);
	}

	@ApiOperation(value = "Retornar uma ave")
	@GetMapping(value = "/ave/{id}")
	public Ave obterPorId(@PathVariable Integer id) {
		return aveService.obterPorId(id);
	}
	
}
