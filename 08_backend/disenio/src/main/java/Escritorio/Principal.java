package Escritorio;


import java.util.Date;

import modelo.entity.Cuenta;
import modelo.entity.Movimiento;
import modelo.entity.Transferencia;

public class Principal {

	public static void main(String[] args) {
		/* Lista de movimientos */
		mostrarMovimientos();
		/* Usuario ingresa una transacción: parametros recibidos */
		
		int idCtaOrigen = 1;
		int idCtaDestino = 2;
		String concepto = "Llenado de Caja";
		Date fecha = new Date();
		
		// Hablar con Modelos
		Transferencia t = new Transferencia(
				Cuenta.getById(idCtaOrigen), 
				Cuenta.getById(idCtaDestino), 
				100, 
				concepto,
				fecha);
		t.save();

		/* Llamar a la Vista */
		
		mostrarMovimientos();

	}
	public static void mostrarMovimientos() {
		if(Transferencia.getMovimientos().size()==0) {
			System.out.println("No existen movimientos");
		}else {
			
			for (Movimiento movimiento : Transferencia.getMovimientos()) {
				System.out.println(movimiento);
			}
		}
	}

}
