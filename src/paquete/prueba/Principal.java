package paquete.prueba;

import java.util.Objects;

public class Principal {
	public static void main(String[] args) {
		// ejemplo 01
//		String str = null;
//        str = Objects.requireNonNull(str);

		// ejemplo 02
		String str = "";
		str = Objects.requireNonNull(str, "str cannot be null");

		// ejemplo 03
		Libro libro = new Libro();
		

		libro.setIsbn("12552");
		try {
			libro.setNombre(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
}
