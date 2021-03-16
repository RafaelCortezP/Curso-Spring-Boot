package com.rafaelcortez.cursospringboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaelcortez.cursospringboot.domain.Cliente;
import com.rafaelcortez.cursospringboot.repositories.ClienteRepository;
import com.rafaelcortez.cursospringboot.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id){
		
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException( 
				 "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		
	}

}
