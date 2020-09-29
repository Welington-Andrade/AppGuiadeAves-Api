package br.com.infnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.model.negocio.Video;
import br.com.infnet.model.service.VideoService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
public class VideoController {
	
	@Autowired private VideoService videoService;
	
	@ApiOperation(value = "Retornar uma lista de vídeos")
	@GetMapping(value = "/videos")
	public List<Video> obterLista() {
		return videoService.obterLista();
	}

	@ApiOperation(value = "Retornar um video")
	@GetMapping(value = "/video/{id}")
	public Video obterPorId(@PathVariable Integer id) {
		return videoService.obterPorId(id);
	}

}
