package Ejercicios;

import java.io.*;

public class Ejercicio5 {
    public static void ejercicio5(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:\\ruta\\hacia\\numeros.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter("C:\\ruta\\hacia\\numeros_pares.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (contienesolonumeros(line)) {
                    printWriter.println(line);
                }
            }

            bufferedReader.close();
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Error al leer o escribir en el archivo.");
            e.printStackTrace();
        }
    } 

    private static boolean contienesolonumeros(String line) {
        String[] numbers = line.split(" ");
        for (String number : numbers) {
            int n = Integer.parseInt(number);
            if (n % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
