package br.com.infnet.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.model.negocio.Video;

@Repository
public interface IVideoRepository extends CrudRepository<Video, Integer>{
	
	List<Video> findAll(Sort by);

}
