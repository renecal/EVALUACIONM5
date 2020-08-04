package com.prueba.securityUtil;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class passGenerator {

	public static void main(String ...args) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
		System.out.println(bCryptPasswordEncoder.encode("2222"));
	}
}
