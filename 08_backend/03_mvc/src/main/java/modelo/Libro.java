package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Libro implements Serializable {

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
		return this.titulo;
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
		return "Libro "+this.isbn+":" + this.titulo;
	}
	
	/* Métodos */
	public static List<Libro> getLibros() {
		if( libros == null) {
			libros = new ArrayList<Libro>();
			
			Libro lib1 = new Libro("111","Las Catilinarias", "Juan Montalvo");
			Libro lib2 = new Libro("222","La Tigra", "José d ela Cuadra");
			Libro lib3 = new Libro("333","A la Costa", "J. Martinez");
			
			libros.add(lib1);
			libros.add(lib2);
			libros.add(lib3);
		}
		return libros;
	}
	
	public static Libro getLibroByIsbn(String isbn) {
		for (Libro libro : libros) {
			if(libro.getIsbn().equals(isbn)) {
				return libro;
			}
		}
		return null;
	}
	public static void deleteById(String isbn) {
		for(int i = 0; i< libros.size(); i++ ) {
			if(libros.get(i).getIsbn().equals(isbn)) {
				libros.remove(i);
			}
		}
	}
	public static void update(Libro libro) {
		Libro miLibro = getLibroByIsbn(libro.getIsbn());
		miLibro.setAutor(libro.getAutor());
		miLibro.setTitulo(libro.getTitulo());
	}
	
	
}
