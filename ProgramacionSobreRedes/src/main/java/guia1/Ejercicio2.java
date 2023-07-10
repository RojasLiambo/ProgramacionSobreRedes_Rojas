package guia1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2 {
	public Ejercicio2() throws IOException {
		PrintStream ps = new PrintStream( System.out );
		ps.println("Seleccione el ejercicio: ");
        ps.println("a: Ordenador de apellidos.");
        ps.println("b: Ordena números.");
        ps.println("c: Numero Par o Impar.");
        ps.println("d: Numero mayor divisible por numero menor.");
        ps.println("e: Signo zodiacal segun tu fecha.");
        ps.println("f: Qué apellido es más largo.");
        ps.println("g: Tabla de multiplicar de un número entero.");
        ps.println("h: Numeros primos.");
        
        String cadena = lecturaDatos();
        cadena = cadena.toLowerCase();
        switch(cadena){
            case "a":
                Ej1();
                ps.println("Ejercicio finalizado");
                break;
            case "b":
            	Ej2();
                ps.println("Ejercicio finalizado");
                break;
            case "c":
            	Ej3();
                ps.println("Ejercicio finalizado");
                break;
            case "d":
            	Ej4();
                ps.println("Ejercicio finalizado");
                break;
            case "e":
            	Ej5();
                ps.println("Ejercicio finalizado");
                break;
            case "f":
            	Ej6();
                ps.println("Ejercicio finalizado");
                break;
            case "g":
            	Ej7();
                ps.println("Ejercicio finalizado");
            	break;
            case "h":
            	Ej8();
                ps.println("Ejercicio finalizado");
            	break;
            default:
                ps.println("Ejercicio erróneo");
                break;
        }
	}
    
    public void Ej1() {
    	PrintStream ps = new PrintStream(System.out);
		int numerador = 0;
		ArrayList<String> lista = new ArrayList<String>();
		ps.println("Ingrese la cantidad de apellidos: ");
		int cant = Integer.parseInt(leer());
		
		
		while (numerador < cant) {
			ps.println("Ingrese un apellido: ");
			lista.add(leer());
			numerador ++;
		}
		Collections.sort(lista);
		
		for (String apellido : lista) {
			ps.println(apellido);
		}
    }
    
    public void Ej2() {
    	PrintStream ps = new PrintStream(System.out);
    	
    	ArrayList<Integer> lista = new ArrayList<Integer>();
    	
    	int numerador = 0;
    	while (numerador < 4) {
    		ps.println("Ingrese un numero: ");
    		int numero = Integer.parseInt(leer());
    		lista.add(numero);
    		numerador ++;
    	}
    	Collections.sort(lista);
    	
    	for (int numero : lista) {
    		ps.println(numero);
    	}
    }
    
    public void Ej3() {
    	PrintStream ps = new PrintStream(System.out);
		ps.println("Ingrese un numero: ");
		int numero = Integer.parseInt(leer());
		if(numero % 2 == 0) {
			ps.println("El número es par");
		} else {
			ps.println("El número es impar");
		}
    }
    
    public void Ej4() {
    	PrintStream ps = new PrintStream(System.out);
		ps.println("Ingrese un numero: ");
		int numero = Integer.parseInt(leer());
		ps.println("Ingrese otro numero: ");
		int numero2 = Integer.parseInt(leer());
		if(numero > numero2) {
			if(numero % numero2 == 0) {
				ps.println("El número mayor ("+numero+") es divisible por el menor("+numero2+")");
			}else {
				ps.println("El número mayor ("+numero+") no es divisible por el menor("+numero2+")");
			}
		}else {
			if(numero2 % numero == 0) {
				ps.println("El número mayor ("+numero2+") es divisible por el menor("+numero+")");
			}else {
				ps.println("El número mayor ("+numero2+") no es divisible por el menor("+numero+")");
			}
		}
    }
    
    public void Ej5() {
    	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		PrintStream ps = new PrintStream(System.out);
		ps.println("Ingrese su fecha de nacimiento (Dia-Mes-Año): ");
		LocalDate fecha = LocalDate.parse(leer(), formato);
		int dia = fecha.getDayOfMonth();
		int mes = fecha.getMonthValue();
		ps.println("Signo zodiacal: "+obtenerSignoZodiaco(mes, dia));
    }
    public static String obtenerSignoZodiaco(int mes, int dia) {
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Capricornio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Acuario";
        } else {
            return "Piscis";
        }
    }
    
    public void Ej6() {
    	PrintStream ps = new PrintStream(System.out);
		ps.println("Ingrese su nombre y apellido: ");
		String nombreApellido = leer();
		ps.println("Ingrese otro nombre y apellido: ");
		String nombreApellido2 = leer();
		
		if(obtenerApellido(nombreApellido).length() > obtenerApellido(nombreApellido2).length()) {
			ps.println("El apellido de "+obtenerNombre(nombreApellido)+ " es más largo");
		}else {
			ps.println("El apellido de "+obtenerNombre(nombreApellido2)+ " es más largo");
		}
    }
    public String obtenerNombre(String nombreApellido) {
		String[] partes = nombreApellido.split(" ");
        String nombre = partes[0];
		return nombre;
	}
	public String obtenerApellido(String nombreApellido) {
		String[] partes = nombreApellido.split(" ");
        String apellido = partes[1];
		
		return apellido;
	}
    
    public void Ej7() {
    	PrintStream ps = new PrintStream(System.out);
		ps.println("Ingrese un numero: ");
		int numero = Integer.parseInt(leer());
		for(int i=0 ; i <= 10 ; i++) {
			ps.println(numero + " * "+i+" = "+numero*i);
		}
    }
    
    public void Ej8() {
    	PrintStream ps = new PrintStream(System.out);
		ps.println("Ingrese un numero: ");
		int numero = Integer.parseInt(leer());
		int contador =0;
		for(int i=1 ; i <= numero; i++) {
			if(numero%i == 0) {
				contador += 1;
			}
		}
		if(contador == 2) {
			ps.println("El número es primo"); 
		}else {
			ps.println("El número no es primo");
		}
    }
    public String leer() {
		InputStreamReader obj = new InputStreamReader(System.in);

		int Byte = 0;
		String cadena = "";

		try {
			while ((Byte = obj.read()) != '\n') {
				if (Byte != '\r')
					
				cadena += (char) Byte;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cadena;
	}
    public static String lecturaDatos() throws IOException{
            int Byte = 0;
            String cadena = "";
        while(   ( Byte = System.in.read() )  != '\n'  )
    	{
                if( Byte != '\r' )
                cadena += (char)Byte;
    	}
            return cadena;
        }
}
