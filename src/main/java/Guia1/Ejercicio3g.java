package Ejercicios;

import java.io.*;

public class Ejercicio7 {
    public static void ejercicio7(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\seba\\Documents\\GitHub\\Programacion_sobre_redes_Giupponi\\caracteres.dat");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese 10 palabras que contengan la letra 'ñ':");
            for (int i = 0; i < 10; i++) {
                String word = reader.readLine();
                printWriter.println(word);
            }

            printWriter.close();

            System.out.println("Fichero original:");
            FileReader fileReader = new FileReader("C:\\Users\\seba\\Documents\\GitHub\\Programacion_sobre_redes_Giupponi\\caracteres.dat");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();

            System.out.println("Fichero arreglado:");
            FileReader fileReader2 = new FileReader("C:\\Users\\seba\\Documents\\GitHub\\Programacion_sobre_redes_Giupponi\\caracteres.dat");
            BufferedReader bufferedReader2 = new BufferedReader(fileReader2);

            FileWriter fileWriter2 = new FileWriter("C:\\Users\\seba\\Documents\\GitHub\\Programacion_sobre_redes_Giupponi\\caracteres.dat", false);
            PrintWriter printWriter2 = new PrintWriter(fileWriter2);

            while ((line = bufferedReader2.readLine()) != null) {
                String fixedLine = line.replace("ñ", "nie-nio");
                System.out.println(fixedLine);
                printWriter2.println(fixedLine);
            }

            bufferedReader2.close();
            printWriter2.close();

        } catch (IOException e) {
            System.out.println("Error al leer o escribir en el archivo.");
            e.printStackTrace();
        }
    }
}
