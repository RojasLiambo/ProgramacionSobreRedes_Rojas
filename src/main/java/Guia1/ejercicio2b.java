package tp;
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.PrintStream;
public class ejercicio2b {


	    public static void ejercicio2B() throws IOException {
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        PrintStream out = System.out;
	        try {
	        out.println("Ingrese cuatro números reales:");
	        double num1 = Double.parseDouble(reader.readLine());
	        double num2 = Double.parseDouble(reader.readLine());
	        double num3 = Double.parseDouble(reader.readLine());
	        double num4 = Double.parseDouble(reader.readLine());

	        double menor = num1;
	        if (num2 < menor) {
	            menor = num2;
	        }
	        if (num3 < menor) {
	            menor = num3;
	        }
	        if (num4 < menor) {
	            menor = num4;
	        }

	        out.println("El número menor es: " + menor);
	        }catch (IOException e) {
	            out.println("Error en la lectura de datos.");
	        }
	        }
	}


