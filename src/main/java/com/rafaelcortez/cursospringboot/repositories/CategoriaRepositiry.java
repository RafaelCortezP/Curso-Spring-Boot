package com.rafaelcortez.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafaelcortez.cursospringboot.domain.Categoria;

@Repository
public interface CategoriaRepositiry extends JpaRepository<Categoria, Integer> {

}