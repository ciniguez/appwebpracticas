package com.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;


public class MovimientoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private int ID;
	private String DTYPE;
	private String CONCEPTO;
	private String DE;
	private String A;
	private Date fecha;
	private Double VALOR;
	
	
	public MovimientoDTO() {}


	public MovimientoDTO(int iD, String dTYPE, String cONCEPTO, String dE, String a, Date fecha, Double vALOR) {
		super();
		ID = iD;
		DTYPE = dTYPE;
		CONCEPTO = cONCEPTO;
		DE = dE;
		A = a;
		this.fecha = fecha;
		VALOR = vALOR;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getDTYPE() {
		return DTYPE;
	}


	public void setDTYPE(String dTYPE) {
		DTYPE = dTYPE;
	}


	public String getCONCEPTO() {
		return CONCEPTO;
	}


	public void setCONCEPTO(String cONCEPTO) {
		CONCEPTO = cONCEPTO;
	}


	public String getDE() {
		return DE;
	}


	public void setDE(String dE) {
		DE = dE;
	}


	public String getA() {
		return A;
	}


	public void setA(String a) {
		A = a;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Double getVALOR() {
		return VALOR;
	}


	public void setVALOR(Double vALOR) {
		VALOR = vALOR;
	}


	@Override
	public String toString() {
		return "MovimientoDTO [ID=" + ID + ", DTYPE=" + DTYPE + ", CONCEPTO=" + CONCEPTO + ", DE=" + DE + ", A=" + A
				+ ", fecha=" + fecha + ", VALOR=" + VALOR + "]";
	}
	
	
}
