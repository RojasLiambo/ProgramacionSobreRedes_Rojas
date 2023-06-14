package tp;

import java.io.Console;

public class ejercicio1d {
	

	    public static void ejercicioD() {
	        Console console = System.console();
	        
	        if (console == null) {
	            System.err.println("La consola no está disponible.");
	            return;
	        }
	        
	        String fahrenheitStr = console.readLine("Ingrese la temperatura en grados Fahrenheit: ");
	        double fahrenheit = Double.parseDouble(fahrenheitStr);
	        
	        double centigrados = (fahrenheit - 32) * 5 / 9;
	        
	        console.printf("grados Fahrenheit son grados centígrados.", fahrenheit, centigrados);
	    }

	}



