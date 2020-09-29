package br.com.infnet.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.infnet.model.negocio.Ave;
import br.com.infnet.model.repository.IAveRepository;

@Service
public class AveService {
	
	@Autowired private IAveRepository repository;
	
	public void incluir(Ave ave) {
		repository.save(ave);
	}

	public List<Ave> obterLista(){		
		return (List<Ave>)repository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}

	public Ave obterPorId(Integer id) {
		return repository.findById(id).orElse(null);
	}
}
