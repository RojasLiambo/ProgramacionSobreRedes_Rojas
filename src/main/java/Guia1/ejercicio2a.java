package tp;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.BufferedReader;
	import java.io.PrintStream;
public class ejercicio2a {


	    public static void ejercicio2A() {
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        PrintStream out = System.out;

	        try {
	            out.println("Ingrese el primer apellido: ");
	            String apellido1 = reader.readLine();

	            out.println("Ingrese el segundo apellido: ");
	            String apellido2 = reader.readLine();

	            out.println("Ingrese el tercer apellido: ");
	            String apellido3 = reader.readLine();

	            // Ordenar los apellidos alfabéticamente
	            String apellidoMenor = apellido1;

	            if (apellido2.compareTo(apellidoMenor) < 0) {
	                apellidoMenor = apellido2;
	                apellido2 = apellido1;
	            }

	            if (apellido3.compareTo(apellidoMenor) < 0) {
	                String temp = apellidoMenor;
	                apellidoMenor = apellido3;
	                apellido3 = apellido2;
	                apellido2 = temp;
	            } else if (apellido3.compareTo(apellido2) < 0) {
	                String temp = apellido3;
	                apellido3 = apellido2;
	                apellido2 = temp;
	            }

	            out.println("Los apellidos ordenados alfabéticamente son:");
	            out.println(apellidoMenor);
	            out.println(apellido2);
	            out.println(apellido3);

	        } catch (IOException e) {
	            out.println("Error en la lectura de datos.");
	        }
	    }
}
