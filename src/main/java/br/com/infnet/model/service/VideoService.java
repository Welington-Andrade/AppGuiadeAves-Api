package br.com.infnet.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.infnet.model.negocio.Video;
import br.com.infnet.model.repository.IVideoRepository;

@Service
public class VideoService {
	
	@Autowired private IVideoRepository videoRepository;
	
	public List<Video> obterLista(){
		return (List<Video>)videoRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
	}
	
	public void incluir(Video video) {
		videoRepository.save(video);
	}

	public void excluir(Integer id) {
		videoRepository.deleteById(id);		
	}

	public Video obterPorId(Integer id) {
		return videoRepository.findById(id).orElse(null);
	}

}
