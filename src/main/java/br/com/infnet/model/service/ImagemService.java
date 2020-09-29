package br.com.infnet.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.infnet.model.negocio.Imagem;
import br.com.infnet.model.repository.IImagemRepository;

@Service
public class ImagemService {
	
	@Autowired private IImagemRepository imgRepository;
	
	public List<Imagem> obterLista(){
		return (List<Imagem>)imgRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
	}
	
	public void incluir(Imagem img) {
		imgRepository.save(img);
	}

	public void excluir(Integer id) {
		imgRepository.deleteById(id);		
	}

	public Imagem obterPorId(Integer id) {
		return imgRepository.findById(id).orElse(null);
	}

}
