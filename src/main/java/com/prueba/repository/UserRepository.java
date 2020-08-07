package com.prueba.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.prueba.entity.Usuario;


public interface UserRepository extends CrudRepository<Usuario, Long> {
	 public Optional<Usuario> findByUsername(String username);
}