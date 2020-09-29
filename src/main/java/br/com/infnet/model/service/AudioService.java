package br.com.infnet.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.infnet.model.negocio.Audio;
import br.com.infnet.model.repository.IAudioRepository;

@Service
public class AudioService {
	
	@Autowired private IAudioRepository audRepository;
	
	public List<Audio> obterLista(){
		return (List<Audio>)audRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
	}
	
	public void incluir(Audio audio) {
		audRepository.save(audio);
	}

	public void excluir(Integer id) {
		audRepository.deleteById(id);		
	}

	public Audio obterPorId(Integer id) {
		return audRepository.findById(id).orElse(null);
	}

}
