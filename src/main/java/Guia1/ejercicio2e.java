package tp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ejercicio2e {
    
    public static void ejercicio2E() throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = System.out;

        ps.println("Ingrese su fecha de nacimiento (formato dd/MM/yyyy): ");
        String fechaNacimientoString = br.readLine();
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = formatter.parse(fechaNacimientoString);
        
        String signo = obtenerSignoZodiaco(fechaNacimiento);
        ps.println("Su signo zodiacal es: " + signo);
    }
    
    public static String obtenerSignoZodiaco(Date fechaNacimiento) {
		int mes = fechaNacimiento.getMonth() + 1; //El método getMonth() devuelve valores de 0 a 11, por eso se le suma 1
        int dia = fechaNacimiento.getDate();
        
        switch(mes) {
            case 1: //Enero
                if(dia >= 20) {
                    return "Acuario";
                } else {
                    return "Capricornio";
                }
            case 2: //Febrero
                if(dia >= 19) {
                    return "Piscis";
                } else {
                    return "Acuario";
                }
            case 3: //Marzo
                if(dia >= 21) {
                    return "Aries";
                } else {
                    return "Piscis";
                }
            case 4: //Abril
                if(dia >= 20) {
                    return "Tauro";
                } else {
                    return "Aries";
                }
            case 5: //Mayo
                if(dia >= 21) {
                    return "Géminis";
                } else {
                    return "Tauro";
                }
            case 6: //Junio
                if(dia >= 21) {
                    return "Cáncer";
                } else {
                    return "Géminis";
                }
            case 7: //Julio
                if(dia >= 23) {
                    return "Leo";
                } else {
                    return "Cáncer";
                }
            case 8: //Agosto
                if(dia >= 23) {
                    return "Virgo";
                } else {
                    return "Leo";
                }
            case 9: //Septiembre
                if(dia >= 23) {
                    return "Libra";
                } else {
                    return "Virgo";
                }
            case 10: //Octubre
                if(dia >= 23) {
                    return "Escorpio";
                } else {
                    return "Libra";
                }
            case 11: //Noviembre
                if(dia >= 22) {
                    return "Sagitario";
                } else {
                    return "Escorpio";
                }
            case 12: //Diciembre
                if(dia >= 22) {
                    return "Capricornio";
                } else {
                    return "Sagitario";
                }
            default:
                return "Fecha inválida";
        }
    }
}
