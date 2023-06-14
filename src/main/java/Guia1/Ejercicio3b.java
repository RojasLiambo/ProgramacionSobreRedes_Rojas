package Ejercicios;

import java.io.*;
public class Ejercicio2 {

	public static void ejercicio1(String[] args) {
		try {
			File file = new File("Numeros.txt");
			PrintWriter writer = new PrintWriter(file);
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String input;
			double value;
			
			while (!(input = reader.readLine()).equalsIgnoreCase("exit")) {
                try {
  
                     value = Double.parseDouble(input);

                    writer.println(value);

                } catch (NumberFormatException e) {
        
                }
            }

            writer.close();
            reader.close();

            System.out.println("Valores numéricos guardados exitosamente en el archivo Numeros.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
