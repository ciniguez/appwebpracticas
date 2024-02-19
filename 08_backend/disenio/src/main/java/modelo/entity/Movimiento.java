package modelo.entity;

import java.util.*;

/**
 * @author Carlos Iñiguez
 */
public class Movimiento {

    /**
     * Default constructor
     */
    public Movimiento() {
    }

    public Movimiento(Date fecha, String concepto, double monto) {
		this.fecha = fecha;
		this.concepto = concepto;
		this.monto = monto;
	}

	/**
     * 
     */
    public Date fecha;

    /**
     * 
     */
    public String concepto;

    /**
     * 
     */
    public double monto;

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Movimiento [fecha=" + fecha + ", concepto=" + concepto + ", monto=" + monto + "]";
	}
    
    

}