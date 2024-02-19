package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Libro implements Serializable{

	private static final long serialVersionUID = 1L;
	private String isbn;
	private String titulo;
	private String autor;
	
	private static List<Libro> libros = null;
	
	public Libro() {
		
	}

	public Libro(String isbn, String titulo, String autor) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Libro "+this.isbn + ": " + this.titulo;
	}
	
	/* Métodos */
	public static List<Libro> getLibros() {
		if(libros == null) {
			libros = new ArrayList<Libro>();
			
			Libro libro1 = new Libro("987", "Las Catilinarias", "Juan Montalvo");
			Libro libro2 = new Libro("456", "La Tigra", "José de la Cuadra");
			Libro libro3 = new Libro("456", "A la Costa", "L. A. Martinez");
			
			libros.add(libro1);
			libros.add(libro2);
			libros.add(libro3);
		}
		return libros;
	}
	public static Libro getLibroByIsbn(String isbn) {
		List<Libro> lista = getLibros();
		for (Libro libro : lista) {
			if(libro.getIsbn().equals(isbn)) {
				return libro;
			}
		}
		return null;
	}
	
}
