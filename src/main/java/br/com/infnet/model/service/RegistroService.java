package br.com.infnet.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.infnet.model.negocio.Registro;
import br.com.infnet.model.repository.IRegistroRepository;

@Service
public class RegistroService {
	
	@Autowired private IRegistroRepository repository;
	
	public void incluir(Registro registro) {
		repository.save(registro);
	}
	
	public List<Registro> obterLista(){
		return (List<Registro>)repository.findAll(Sort.by(Sort.Direction.ASC, "local"));
	}

	public Registro obterPorId(Integer id) {
		return repository.findById(id).orElse(null);
	}

	public void excluir(Integer id) {
		repository.deleteById(id);
	}
}
