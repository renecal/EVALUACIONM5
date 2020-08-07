package com.prueba.security;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
<<<<<<< Updated upstream:src/main/java/com/prueba/entity/User.java
import javax.persistence.ManyToOne;
=======
import javax.persistence.ManyToMany;

import com.prueba.security.Authority;
>>>>>>> Stashed changes:src/main/java/com/prueba/security/User.java

import com.prueba.interfaceService.Autoridad;

@Entity
public class User {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String username;
<<<<<<< Updated upstream:src/main/java/com/prueba/entity/User.java
	private String pass;
	private boolean activo;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinTable(name="autoridad_users",
	joinColumns=@JoinColumn(name="user_id"),
	inverseJoinColumns=@JoinColumn(name="autoridad_id"))
	private Set<Autoridad> autoridad;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "persona_id")
	private Persona persona;
=======

	@Column
	private String password;

	@Column
	private boolean enabled;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "authorities_user", joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "authority_id"))
	private Set<Authority> authority;

    public User() {}
>>>>>>> Stashed changes:src/main/java/com/prueba/security/User.java

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

<<<<<<< Updated upstream:src/main/java/com/prueba/entity/User.java
	public Set<Autoridad> getAutoridad() {
		return autoridad;
	}

	public void setAutoridad(Set<Autoridad> autoridad) {
		this.autoridad = autoridad;
	}

	
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
=======
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<Authority> getAuthority() {
		return authority;
	}

	public void setAuthority(Set<Authority> authority) {
		this.authority = authority;
	}
>>>>>>> Stashed changes:src/main/java/com/prueba/security/User.java

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

<<<<<<< Updated upstream:src/main/java/com/prueba/entity/User.java
	
	
	
	
=======
>>>>>>> Stashed changes:src/main/java/com/prueba/security/User.java
}
