package com.base.entidade.repository;

import org.springframework.data.repository.CrudRepository;

import com.base.entidade.models.Pessoa;

public interface EntidadeRepository extends CrudRepository<Pessoa, String> {
	
	
}
