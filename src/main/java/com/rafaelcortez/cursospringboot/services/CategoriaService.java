package com.rafaelcortez.cursospringboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaelcortez.cursospringboot.domain.Categoria;
import com.rafaelcortez.cursospringboot.repositories.CategoriaRepositiry;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepositiry repo;
	
	public Categoria find(Integer id){
		
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		
	}

}
