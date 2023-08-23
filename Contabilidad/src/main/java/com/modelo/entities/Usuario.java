package com.modelo.entities;

import java.util.*;

import javax.persistence.*;

/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:16
 */
@Entity
public class Usuario implements java.io.Serializable {

private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id = 0;
	@Column
	private String nombre;
	@Column
	private String username;
	@Column
	private String clave;
	
	public Usuario(){

	}

	public Usuario(Integer id, String nombre, String username, String clave) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.username = username;
		this.clave = clave;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setClave(String newVal){
		clave = newVal;
	}

	public String getClave(){
		return clave;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setUsername(String newVal){
		username = newVal;
	}

	public String getUsername(){
		return username;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNombre(String newVal){
		nombre = newVal;
	}

	public String getNombre(){
		return nombre;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setId(int newVal){
		id = newVal;
	}

	public int getId(){
		return id;
	}

@Override

	public int hashCode() {

		int hash = 0;

        hash += (this.id != null ? this.id.hashCode() : 0);

        return hash;

		

	}

	@Override

	public boolean equals(Object object) {

		

		// TODO: Warning - this method won't work in the case the id fields are not set

        if (!(object instanceof Usuario)) {

            return false;

        }

        Usuario other = (Usuario) object;

        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {

            return false;

        }

        return true;

	}

	@Override

	public String toString() {

		return "Usuario: " + this.id;

	}

}