package modelo.entity;

import java.util.List;

/**
 * @author Carlos Iñiguez
 */
public class Intercambio extends Categoria {

	private static Intercambio cat = null;
	
	public Intercambio(Integer id, String nombre) {
		super(id, nombre);
	}

	public static Intercambio getCatIntercambio() {
		if(cat == null) {
			cat = new Intercambio(1, "Transferencia entre Cuentas");
		}
		return cat;
	}


	@Override
	protected List<Categoria> getAll() {
		return super.getAll();
	}



}