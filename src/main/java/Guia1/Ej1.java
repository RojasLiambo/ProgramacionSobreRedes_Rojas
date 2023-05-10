package Guia1;

import java.io.IOException;
import java.io.PrintStream;

public class Ej1 {
	
	
	public Ej1a() {
		
		// Ejercicio 1a:
		// Dados el valor de una hora de trabajo y la cantidad de horas trabajadas, 
		// la computadora muestra el valor del sueldo bruto.

		int sueldoBruto = 0;
		
		//Stri

		PrintStream ps = new PrintStream( System.out );
		
		try {
			
			ps.print("Pago por hora de trabajo: ");
			
			int Byte = 0;
			String cadena = "";
			while(   ( Byte = System.in.read() )  != '\n'  )
			{
				if( Byte != '\r' )
					cadena += (char)Byte;
			}
			//cadena.
			int ph = Integer.parseInt(cadena) ;
			//int ph = Integer.parseUnsignedInt(cadena);
			
			ps.print("Horas trabajadas: ");
			Byte = 0;
			cadena = "";
			while(   ( Byte = System.in.read() )  != '\n'  )
			{
				if( Byte != '\r' )
					cadena += (char)Byte;
			}
			//cadena.
			int ht = Integer.parseInt(cadena) ;
			//int ht = Integer.parseUnsignedInt(cadena);
			
			int resultado = ph * ht;
			ps.println( resultado );
			//ps.println(  (char)System.in.read()  ) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//int hora= 0 ;
		//System.out.println("El sueldo bruto: ");

	
		
	}
	
	public Ej1b() {
		
		// Ejercicio 1b:
		// Dados los valores de dos de los ángulos interiores de un triángulo, 
		// la computadora muestra el valor del restante.
		

	}
	
	public Ej1c() {
		
		// Ejercicio 1c:
		// Dada la superficie de un cuadrado (en m2),
		// la computadora muestra su perímetro.

		
	}
	
	public Ej1d() {
		
		// Ejercicio 1d:
		// Dada una temperatura en grados Fahrenheit, 
		// la computadora la muestra en grados centígrados.
		

	}
	
	public Ej1e() {
		
		// Ejercicio 1e:
		// Dado un tiempo en segundos, 
		// la computadora lo muestra expresado en días, horas, minutos y segundos.

		
	}
	
	public Ej1f1() {
		
		// Ejercicio 1f:
		// Dado el precio de un artículo, la computadora muestra los valores a pagar según cada plan. 
		// Una casa de artículos para el hogar ofrece a sus clientes los siguientes planes de pago:
		
		// Ejeercicio 1f1:
		// 1 Plan 1: 100% al contado. Se hace el 10% de descuento sobre el precio publicado.

		
	}
	
	public Ej1f2() {
		
		// Ejercicio 1f2:
		// Plan 2: 50% al contado y el resto en 2 cuotas iguales. El precio publicado se incrementa en un 10%.

		
	}
	
	public Ej1f3() {
		
		// Ejercicio 1f3:
		// Plan 3: 25% al contado y el resto en 5 cuotas iguales. El precio publicado se incrementa en un 15%.

		
	}
	
	public Ej1f4() {
		
		// Ejercicio 1f4:
		// Plan 4: Totalmente financiado en 8 cuotas. El 60% se reparte en partes iguales en las primeras 4 cuotas y 
		// el resto se reparte en partes iguales en las últimas 4 cuotas. El precio publicado se incrementa en un 25%.

		
	}
	
	public Ej1g() {
		
		// Ejercicio 1g:
		// Dado el signo zodiacal del usuario, la computadora muestra su mes de nacimiento aproximado.
		
		
	}

}
