package com.prueba.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String username;
	@Column(nullable = false)
	private String pass;
	@Column(nullable = false)
	private boolean activo ;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name="autoridad_users",
	joinColumns=@JoinColumn(name="user_id", nullable = false ),
	inverseJoinColumns=@JoinColumn(name="autoridad_id", nullable = false))
	private List<Autoridad> autoridad;

	@ManyToOne(fetch = FetchType.EAGER, optional=false)
	@JoinColumn(name = "persona_id")
	private Persona personaa;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	public List<RegistroAccidente> registroAcc;
	 
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

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public List<Autoridad> getAutoridad() {
		return autoridad;
	}

	public void setAutoridad(List<Autoridad> autoridad) {
		this.autoridad = autoridad;
	}


	public Persona getPersona() {
		return personaa;
	}

	public void setPersona(Persona persona) {
		this.personaa = persona;
	}


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
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", pass=" + pass + "]";
	}





}