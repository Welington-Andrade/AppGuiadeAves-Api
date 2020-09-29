package br.com.infnet.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.model.negocio.Audio;

@Repository
public interface IAudioRepository extends CrudRepository<Audio, Integer>{
	
	List<Audio> findAll(Sort by);

}
