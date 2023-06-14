package Ejercicios;

import java.io.*;

public class Ejercicio1 {
    public static void ejercicio1(String[] args) {
        try {
            File file = new File("output.txt");

            PrintWriter writer = new PrintWriter(file);

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          
            String input;
            String lastInput = null;

            while (!(input = reader.readLine()).equalsIgnoreCase("exit")) {
                lastInput = input;
            }
            

           
            writer.println(lastInput);

            writer.close();
            reader.close();

            System.out.println("Archivo guardado exitosamente.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}