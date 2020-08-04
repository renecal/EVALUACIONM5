package com.prueba.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class RegistroAccidente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String fecha;
	private String Cargo;
	private String Descripcion;
	
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "persona_id")
	private Persona persona;
	
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "tipo_accidente_id")
	private TipoAccidente tipoAccidente;
	
	public RegistroAccidente() {}	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	



	public TipoAccidente getTipoAccidente() {
		return tipoAccidente;
	}


	public void setTipoAccidente(TipoAccidente tipoAccidente) {
		this.tipoAccidente = tipoAccidente;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getFecha() {
		return fecha;
	}

	
	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
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
		RegistroAccidente other = (RegistroAccidente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RegistroAccidente [id=" + id + ", fAccidente=" + fecha + ", Cargo=" + Cargo + ", Descripcion="
				+ Descripcion + "]";
	}
	
	
}
