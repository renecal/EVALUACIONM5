package com.prueba.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="Persona")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String sisPrevision;
	
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
	public List<RegistroAccidente> registroAcc;
    
<<<<<<< Updated upstream
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    private User user;
=======
   // @OneToMany(mappedBy = "personaa", cascade = CascadeType.ALL)
   // public List<User> user;
>>>>>>> Stashed changes
	
	public Persona() {}
	
	public Persona(Long id, String nombre, String apellido, String email, String telefono, String sisPrevision
			) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.sisPrevision = sisPrevision;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getSisPrevision() {
		return sisPrevision;
	}

	public void setSisPrevision(String sisPrevision) {
		this.sisPrevision = sisPrevision;
	}
	
	


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
		Persona other = (Persona) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", telefono=" + telefono + ", sisPrevision=" + sisPrevision + "]";
	}

	
	
	
	
	
}
