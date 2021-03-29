package com.rafaelcortez.cursospringboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rafaelcortez.cursospringboot.domain.Cliente;
import com.rafaelcortez.cursospringboot.repositories.ClienteRepository;
import com.rafaelcortez.cursospringboot.security.UserSS;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private ClienteRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Cliente cli = repo.findByEmail(username);
		if(cli == null) {
			throw new UsernameNotFoundException(username);
		}
		
		return new UserSS(cli.getId(), cli.getEmail(), cli.getSenha(), cli.getPerfis());
	}

}
