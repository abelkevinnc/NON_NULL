package paquete.prueba;

import java.util.Objects;

public class Libro {
	private String nombre;
	private String isbn;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		//Objects.requireNonNull(nombre, "nombre must not be null"); forma menos profesional
		//this.nombre = nombre;
		this.nombre = Objects.requireNonNull(nombre, "nombre must not be null");
		
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
}
