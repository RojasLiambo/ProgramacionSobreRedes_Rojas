package Guia1;

import java.io.IOException;
import java.io.PrintStream;

public class Ej1 {
	
	
	public Ej1() {
		
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

}
