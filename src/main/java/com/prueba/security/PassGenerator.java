package com.prueba.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassGenerator {
	
	public static void main(String ...args) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
		System.out.println(bCryptPasswordEncoder.encode("1234"));
	}
<<<<<<< Updated upstream:src/main/java/com/prueba/securityUtil/passGenerator.java
=======

>>>>>>> Stashed changes:src/main/java/com/prueba/security/PassGenerator.java
}
