package com.rafaelcortez.cursospringboot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rafaelcortez.cursospringboot.domain.Categoria;
import com.rafaelcortez.cursospringboot.repositories.CategoriaRepositiry;

@SpringBootApplication
public class CursospringbootApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepositiry categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursospringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}

}
