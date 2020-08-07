<<<<<<< Updated upstream:src/main/java/com/prueba/interfaceService/Autoridad.java
package com.prueba.interfaceService;
=======
package com.prueba.security;
>>>>>>> Stashed changes:src/main/java/com/prueba/security/Authority.java

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Authority {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
<<<<<<< Updated upstream:src/main/java/com/prueba/interfaceService/Autoridad.java
	private String autoridad;
	
=======
	
	private String Authority;

>>>>>>> Stashed changes:src/main/java/com/prueba/security/Authority.java
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
<<<<<<< Updated upstream:src/main/java/com/prueba/interfaceService/Autoridad.java
	public String getAutoridad() {
		return autoridad;
	}
	public void setAutoridad(String autoridad) {
		this.autoridad = autoridad;
	}
	
	
=======

	public String getAuthority() {
		return Authority;
	}

	public void setAuthority(String authority) {
		Authority = authority;
	}
	
	
	
	
	
>>>>>>> Stashed changes:src/main/java/com/prueba/security/Authority.java
}
