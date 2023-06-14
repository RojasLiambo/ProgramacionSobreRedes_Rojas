package tp;
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.PrintStream;



	public class ejercicio2d {

	    public static void ejercicio2D() throws IOException {
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        PrintStream out = System.out;
try {
	        // Leer los dos números
	        out.println("Ingresa el primer número:");
	        double num1 = Double.parseDouble(reader.readLine());
	        out.println("Ingresa el segundo número:");
	        double num2 = Double.parseDouble(reader.readLine());

	        // Encontrar el número mayor y el menor
	        double mayor = Math.max(num1, num2);
	        double menor = Math.min(num1, num2);

	        // Verificar si el mayor es divisible por el menor
	        if (mayor % menor == 0) {
	            out.println("El número mayor es divisible por el menor.");
	        } else {
	            out.println("El número mayor no es divisible por el menor.");
	        }
}catch (IOException e) {
    out.println("Error en la lectura de datos.");
}
	    }
	    
	}


