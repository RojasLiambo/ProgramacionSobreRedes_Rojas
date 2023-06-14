package tp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ejercicio2h {
    public static void ejercicio2H() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream printer = System.out;
        int number;
        boolean isPrime = true;

        printer.println("Ingrese un número natural:");
        String input = reader.readLine();
        number = Integer.parseInt(input);

        if (number == 1 || number == 0) {
            printer.println(number + " no es un número primo ni compuesto.");
            return;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            printer.println(number + " es un número primo.");
        } else {
            printer.println(number + " no es un número primo.");
        }
    }
}



