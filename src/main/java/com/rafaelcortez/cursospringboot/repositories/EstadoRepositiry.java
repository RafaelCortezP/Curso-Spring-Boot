package com.rafaelcortez.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafaelcortez.cursospringboot.domain.Estado;

@Repository
public interface EstadoRepositiry extends JpaRepository<Estado, Integer> {

}
