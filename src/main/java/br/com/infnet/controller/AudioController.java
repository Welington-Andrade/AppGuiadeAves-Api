package br.com.infnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.model.negocio.Audio;
import br.com.infnet.model.service.AudioService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class AudioController {
	
	@Autowired private AudioService audService;
	
	@ApiOperation(value = "Retornar uma lista de áudios")
	@GetMapping(value = "/audios")
	public List<Audio> obterLista() {
		return audService.obterLista();
	}

	@ApiOperation(value = "Retornar um audio")
	@GetMapping(value = "/audio/{id}")
	public Audio obterPorId(@PathVariable Integer id) {
		return audService.obterPorId(id);
	}

}
