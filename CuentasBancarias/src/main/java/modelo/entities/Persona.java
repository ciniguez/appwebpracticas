package modelo.entities;

import java.util.*;

import javax.persistence.*;

/**
 * @author crossover
 * @version 1.0
 * @created 16-ago-2023 20:21:21
 */
@Entity
public class Persona implements java.io.Serializable {

private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String nombre;
	@Column
	private String username;
	@Column
	private String clave;

	public Persona(){

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

        if (!(object instanceof Persona)) {

            return false;

        }

        Persona other = (Persona) object;

        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {

            return false;

        }

        return true;

	}

	@Override

	public String toString() {

		return "Persona: " + this.id;

	}

}