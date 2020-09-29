package br.com.infnet.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.model.negocio.Ave;

@Repository
public interface IAveRepository extends CrudRepository<Ave, Integer> {
	
	List<Ave> findAll(Sort by);
}
