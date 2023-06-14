package Ejercicios;

import java.io.*;

public class Ejercicio4 {
    public static void ejercicio4(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\seba\\Documents\\GitHub\\Programacion_sobre_redes_Giupponi\\numerosPares.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
            e.printStackTrace();
        }
    }
}