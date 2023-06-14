package Ejercicios;

import java.io.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\seba\\Documents\\GitHub\\Programacion_sobre_redes_Giupponi\\numeros.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter("C:\\Users\\seba\\Documents\\GitHub\\Programacion_sobre_redes_Giupponi\\primos.dat");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] numbers = line.split(" ");
                for (String number : numbers) {
                    int n = Integer.parseInt(number);
                    if (isPrime(n)) {
                        printWriter.println(n);
                    }
                }
            }

            bufferedReader.close();
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Error al leer o escribir en el archivo.");
            e.printStackTrace();
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}