package Ejercicios;

import java.io.*;

public class Ejercicio3 {
    public static void ejercicio3(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\seba\\Documents\\GitHub\\Programacion_sobre_redes_Giupponi\\numerosPares.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter writer = new PrintWriter(bufferedWriter);

            for (int i = 0; i <= 1000; i++) {
                if (i % 2 == 0) {
                    writer.println(i);
                }
            }

            writer.close();
            System.out.println("Números pares guardados exitosamente en el archivo 'numeros.txt'.");
        } catch (IOException e) {
            System.out.println("Error al guardar los números en el archivo.");
            e.printStackTrace();
        }
    }
}