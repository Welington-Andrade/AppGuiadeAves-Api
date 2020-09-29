package br.com.infnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.model.negocio.Imagem;
import br.com.infnet.model.service.ImagemService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class ImagemController {
	
	@Autowired private ImagemService imgService;
	
	@ApiOperation(value = "Retornar uma lista de imagens")
	@GetMapping(value = "/imagens")
	public List<Imagem> obterLista() {
		return imgService.obterLista();
	}

	@ApiOperation(value = "Retornar uma imagem")
	@GetMapping(value = "/imagem/{id}")
	public Imagem obterPorId(@PathVariable Integer id) {
		return imgService.obterPorId(id);
	}

}
