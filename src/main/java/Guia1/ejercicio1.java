package tp;
import java.io.Console;
import java.io.PrintStream;

public class ejercicio1 {
	
	    public static void tp1a() {
	        
	        Console consola = System.console();
	        PrintStream ps = System.out;
	        
	        ps.println("Ingrese el valor de una hora de trabajo:");
	        double valorHora = Double.parseDouble(consola.readLine());
	        
	        ps.println("Ingrese la cantidad de horas trabajadas:");
	        double horasTrabajadas = Double.parseDouble(consola.readLine());
	        
	        double sueldoBruto = valorHora * horasTrabajadas;
	        
	        ps.printf("El sueldo bruto es: ", sueldoBruto);
	    }
	    
	    
	}

