package com.modelo.entidades;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * Entity implementation class for Entity: TipoTelefono
 *
 */
@Entity
@Table(name="Banco")
@NamedQueries({
	@NamedQuery(name = "listarBancos", query = "SELECT b FROM Banco b ORDER BY b.nombreBanco ASC")
})
public class Banco implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idBanco")
	private Integer id;
	
	@Column (name="nombre_banco")
	private String nombreBanco;
	

	public Banco() {
	}
	
	public Banco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}
	

	public String getNombreBanco() {
		return nombreBanco;
	}




	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}




	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
        if (!(object instanceof Banco)) {
            return false;
        }
        Banco other = (Banco) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
	}

	@Override
	public String toString() {
		return "Banco: " + this.id + "("+ this.nombreBanco+ ")";
	}
	
	
   
}
