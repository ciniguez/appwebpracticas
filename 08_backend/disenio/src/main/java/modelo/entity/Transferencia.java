package modelo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Carlos Iñiguez
 */
public class Transferencia extends Movimiento {

	private Cuenta origen;
	private Cuenta destino;
	private Intercambio categoriaTransferencia;
	
	private static List<Movimiento> movimientos = null;
    /**
     * Default constructor
     */
    public Transferencia() {
    }
    
    public Transferencia(Cuenta origen, Cuenta destino, double valor, String concepto, Date fecha) {
		super(fecha, concepto, valor);
		this.origen = origen;
		this.destino = destino;
		this.categoriaTransferencia = Intercambio.getCatIntercambio();
	}

	/**
     * @param t
     */
    public void save() {
    	//getMovimientos().add(this);
    }

	public Cuenta getOrigen() {
		return origen;
	}

	public void setOrigen(Cuenta origen) {
		this.origen = origen;
	}

	public Cuenta getDestino() {
		return destino;
	}

	public void setDestino(Cuenta destino) {
		this.destino = destino;
	}

	public Intercambio getCategoriaTransferencia() {
		return categoriaTransferencia;
	}

	public void setCategoriaTransferencia(Intercambio categoriaTransferencia) {
		this.categoriaTransferencia = categoriaTransferencia;
	}
	
	/*** ******/
	public static List<Movimiento> getMovimientos(){
		if(movimientos == null) {
			movimientos = new ArrayList<Movimiento>();
		}
		return movimientos;
	}
}