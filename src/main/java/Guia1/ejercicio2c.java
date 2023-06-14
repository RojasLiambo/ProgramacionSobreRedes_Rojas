package tp;
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
import java.io.PrintStream;
public class ejercicio2c {


	   public static void ejercicio2C() throws IOException {
	       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	       PrintStream out = System.out;
	       out.print("Ingrese un número: ");
	       try {
	       int num = Integer.parseInt(reader.readLine());
	       if(num % 2 == 0) {
	           out.println(num + " es un número par.");
	       } else {
	           out.println(num + " es un número impar.");
	       }
	       }catch (IOException e) {
	    	   out.println("Error en la lectura de datos.");
	        }
	   }
	}


