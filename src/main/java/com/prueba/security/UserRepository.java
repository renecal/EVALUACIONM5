package com.prueba.security;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<Usuario, Long> {
	 public Optional<Usuario> findByUsername(String username);
}