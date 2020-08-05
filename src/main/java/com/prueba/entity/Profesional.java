package com.prueba.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Profesional {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String registro;
	private String cargo;
	
	public Profesional() {} 
	
	public Profesional(Long id, String nombre, String registro,String cargo, Set<RegistroAccidente> rAcc) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.registro = registro;
		this.cargo=cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
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
		return "Profesional [id=" + id + ", nombre=" + nombre + ", registro=" + registro + ", cargo=" + cargo + "]";
	}
	
}
