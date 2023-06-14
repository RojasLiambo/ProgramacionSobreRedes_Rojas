package tp;
	import java.io.Console;
	import java.io.PrintStream;
public class ejercicio1c {



	    public static void ejercicioC() {
	        
	        Console console = System.console();
	        PrintStream ps = System.out;
	        
	        ps.println("Ingrese la superficie del cuadrado (en m2):");
	        double superficie = Double.parseDouble(console.readLine());
	        
	        double lado = Math.sqrt(superficie);
	        double perimetro = 4 * lado;
	        
	        ps.printf("El perímetro del cuadrado es: m", perimetro);
	    }
	}

