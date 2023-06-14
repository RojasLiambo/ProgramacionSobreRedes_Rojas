package tp;
	import java.io.Console;
	import java.io.PrintStream;
public class ejercicio1b {

	    public static void ejercicio1B() {
	        
	        Console console = System.console();
	        PrintStream ps = System.out;
	        
	        ps.println("Ingrese el valor de un ángulo interior del triángulo:");
	        double angulo1 = Double.parseDouble(console.readLine());
	        
	        ps.println("Ingrese el valor del otro ángulo interior del triángulo:");
	        double angulo2 = Double.parseDouble(console.readLine());
	        
	        double angulo3 = 180 - angulo1 - angulo2;
	        
	        ps.printf("El valor del tercer ángulo interior es: %.2f", angulo3);
	    }
	}


