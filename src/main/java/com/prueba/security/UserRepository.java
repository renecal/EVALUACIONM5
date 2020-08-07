package com.prueba.security;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {
<<<<<<< Updated upstream:src/main/java/com/prueba/repository/UserRepository.java
	 public Optional<User> findByUsername(String username);
=======
  public Optional<User> findByUsername(String username);
>>>>>>> Stashed changes:src/main/java/com/prueba/security/UserRepository.java
}
