package com.prueba.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoAccidente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tAccidente;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String gettAccidente() {
		return tAccidente;
	}
	public void settAccidente(String tAccidente) {
		this.tAccidente = tAccidente;
	}
	
	
}
