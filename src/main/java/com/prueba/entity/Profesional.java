package com.prueba.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Profesional")
public class Profesional {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String registro;

	@OneToMany(mappedBy = "profesional", cascade = CascadeType.ALL)
	public List<RegistroAccidente> registroAcc;

	public Profesional() {
	}

	public Profesional(Long id, String nombre, String registro, Set<RegistroAccidente> rAcc) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.registro = registro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	@Override
	public String toString() {
		return "Profesional [id=" + id + ", nombre=" + nombre + ", registro=" + registro + "]";
	}

}
