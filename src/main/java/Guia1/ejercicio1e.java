package tp;

import java.io.Console;

public class ejercicio1e {
	    
	    public static void ejercicioE() {
	        Console console = System.console();
	        
	        if (console == null) {
	            System.err.println("La consola no está disponible.");
	            return;
	        }
	        
	        String tiempoSegundosStr = console.readLine("Ingrese el tiempo en segundos: ");
	        int tiempoSegundos = Integer.parseInt(tiempoSegundosStr);
	        
	        int segundos = tiempoSegundos % 60;
	        int minutos = (tiempoSegundos / 60) % 60;
	        int horas = (tiempoSegundos / (60 * 60)) % 24;
	        int dias = tiempoSegundos / (60 * 60 * 24);
	        
	        console.printf("%d segundos equivalen a %d días, %d horas, %d minutos y %d segundos.\n",
	                tiempoSegundos, dias, horas, minutos, segundos);
	    }

	}


