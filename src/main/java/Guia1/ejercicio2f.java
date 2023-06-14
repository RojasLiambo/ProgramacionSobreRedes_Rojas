package tp;
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.PrintStream;
	
	public class ejercicio2f {

	    public static void ejercicio2F() throws IOException {

	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        PrintStream out = System.out;
	        try {
	        // Leer nombres y apellidos de las dos personas
	        out.println("Ingrese el nombre y apellido de la primera persona: ");
	        String[] persona1 = reader.readLine().split(" ");
	        out.println("Ingrese el nombre y apellido de la segunda persona: ");
	        String[] persona2 = reader.readLine().split(" ");

	        // Obtener longitud de los apellidos
	        int longitudApellido1 = persona1[1].length();
	        int longitudApellido2 = persona2[1].length();

	        // Comparar longitud de los apellidos y mostrar resultado
	        if (longitudApellido1 > longitudApellido2) {
	        	out.println("El apellido más largo es de la primera persona: " + persona1[1]);
	        } else if (longitudApellido1 < longitudApellido2) {
	        	out.println("El apellido más largo es de la segunda persona: " + persona2[1]);
	        } else {
	        	out.println("Ambos apellidos tienen la misma longitud.");
	        }
	        }catch (IOException e) {
	            out.println("Error en la lectura de datos.");
	        }
	    }
	}


