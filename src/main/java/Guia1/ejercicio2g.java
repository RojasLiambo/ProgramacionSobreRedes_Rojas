package tp;
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
import java.io.PrintStream;
public class ejercicio2g {
	

	    public static void ejercicio2G() throws IOException {
	    	PrintStream out = System.out;
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    	try {
	        out.print("Ingrese un número: ");

	        int n = Integer.parseInt(reader.readLine());

	        for (int i = 1; i <= 10; i++) {
	            System.out.println(n + " x " + i + " = " + (n*i));
	        }
	    	}catch (IOException e) {
	            out.println("Error en la lectura de datos.");
	        }
	    }
	}


