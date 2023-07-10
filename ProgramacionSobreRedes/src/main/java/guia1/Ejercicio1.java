package guia1;

import java.io.IOException;
import java.io.PrintStream;

public class Ejercicio1 {
	public Ejercicio1() throws IOException {
		PrintStream ps = new PrintStream( System.out );
		 ps.println("Seleccione el ejercicio: ");
	     ps.println("a: Sueldo bruto.");
	     ps.println("b: Angulos de un triangulo.");
	     ps.println("c: Superficie de un cuadrado.");
	     ps.println("d: Grados Fahrenheit a centigrados.");
	     ps.println("e: Segundos a días, horas, minutos y segundos.");
	     ps.println("f: Precios según los planes.");
	     ps.println("g: En qué mes naciste según tu signo zodiacal.");
	     
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
	         default:
	             ps.println("Ejercicio erróneo");
	             break;
	     }
	     
	}
	public void Ej1() {
		int sueldoBruto = 0;
		PrintStream ps = new PrintStream( System.out );
		ps.println("Bienvenido al ejercicio 1.A");
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
	}
	
	public void Ej2() {
		PrintStream ps = new PrintStream( System.out );
        ps.println("Bienvenido al ejercicio 1.B");
		try {
			ps.print("Primer angulo: ");
			
			int Byte = 0;
			String cadena = "";
			while(   ( Byte = System.in.read() )  != '\n'  )
			{
				if( Byte != '\r' )
					cadena += (char)Byte;
			}
			//cadena.
			int angulo1 = Integer.parseInt(cadena) ;
			//int ph = Integer.parseUnsignedInt(cadena);
			
			ps.print("Segundo angulo: ");
			Byte = 0;
			cadena = "";
			while(   ( Byte = System.in.read() )  != '\n'  )
			{
				if( Byte != '\r' )
					cadena += (char)Byte;
			}
			//cadena.
			int angulo2 = Integer.parseInt(cadena) ;
			//int ht = Integer.parseUnsignedInt(cadena);
			int resultado = 180 - (angulo1 + angulo2); 
			ps.println( "El angulo restante es de: "+ resultado + "°");
			//ps.println(  (char)System.in.read()  ) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Ej3() {
		PrintStream ps = new PrintStream( System.out );
	    ps.println("Bienvenido al ejercicio 1.C");
			try {
				ps.print("Metros cuadrados: ");
				
				int Byte = 0;
				String cadena = "";
				while(   ( Byte = System.in.read() )  != '\n'  )
				{
					if( Byte != '\r' )
						cadena += (char)Byte;
				}
				
				int m2 = Integer.parseInt(cadena) ;
	                        
				int resultado = m2 *4; 
				ps.println( "El perimetro del cuadrado es de: "+ resultado + " mts");
				//ps.println(  (char)System.in.read()  ) ;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void Ej4() {
		PrintStream ps = new PrintStream( System.out );
	    ps.println("Bienvenido al ejercicio 1.D");
			try {
				ps.print("Grados Fahrenheit: ");
				
				int Byte = 0;
				String cadena = "";
				while(   ( Byte = System.in.read() )  != '\n'  )
				{
					if( Byte != '\r' )
						cadena += (char)Byte;
				}
				
				int gf = Integer.parseInt(cadena) ;
	                        
				double gc = (gf-32)/1.8; 
				ps.println( "Temperatura: "+ gc + " °C");
				//ps.println(  (char)System.in.read()  ) ;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void Ej5() {
		PrintStream ps = new PrintStream( System.out );
        ps.println("Bienvenido al ejercicio 1.C");
		try {
			ps.print("Cantidad de segundos: ");
			
			int Byte = 0;
			String cadena = "";
			while(   ( Byte = System.in.read() )  != '\n'  )
			{
				if( Byte != '\r' )
					cadena += (char)Byte;
			}
			
			int segundos = Integer.parseInt(cadena) ;
                        
			int dias = (int)segundos/86400; 
                        int resto = segundos - (dias * 86400);
                        int horas = (int)resto / 3600;
                        resto = resto - (horas * 3600);
                        int minutos = (int)resto/60;
                        resto = resto - (minutos *60);
                        int sg = resto;
			ps.println( "Eso equivale a "+dias+" días, "+horas+" horas, "+minutos+" minutos y "+sg+" segundos.");
			//ps.println(  (char)System.in.read()  ) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Ej6() {
		PrintStream ps = new PrintStream( System.out );
        ps.println("Bienvenido al ejercicio 1.C");
		try {
			ps.print("Precio del producto: ");
			
			int Byte = 0;
			String cadena = "";
			while(   ( Byte = System.in.read() )  != '\n'  )
			{
				if( Byte != '\r' )
					cadena += (char)Byte;
			}
			
			int precio = Integer.parseInt(cadena) ;
                        // Plan 1
                        double plan1 = precio - (precio * 0.1);
                        // Plan 2
                        double plan2 = precio * 1.10;
                        double plan2Cont = plan2/2;
                        double plan2Cuo = plan2/4;
                        // Plan 3
                        double plan3 = precio * 1.15;
                        double plan3Cont = precio/4;
                        double plan3Cuo = precio*0.75;
                        plan3Cuo = plan3Cuo/5;
                        // Plan 4
                        double plan4 = precio * 1.25;
                        double plan4Cuo = precio * 0.60;
                        plan4Cuo = plan4Cuo/4;
                        double plan4Cuo2 = precio * 0.40;
                        plan4Cuo2 = plan4Cuo2/4;
                        
                        
                        ps.println("Con el plan 1 te saldrá $"+plan1+" al contado.");
                        ps.println("Con el plan 2 te saldrá $"+plan2Cont+" al contado más 2 cuotas iguales de $"+plan2Cuo+", siendo un total de $"+plan2);
                        ps.println("Con el plan 3 te saldrá $"+plan3Cont+" al contado más 5 cuotas iguales de $"+plan3Cuo+", siendo un total de $"+plan3);
                        ps.println("Con el plan 4 te saldrá $"+plan4Cuo+" las primeras 4 cuotas y luego 4 más de $"+plan4Cuo2+", siendo un total de $"+plan4);
			//ps.println(  (char)System.in.read()  ) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Ej7() {
		PrintStream ps = new PrintStream( System.out );
        ps.println("Bienvenido al ejercicio 1.G");
		try {
			ps.print("Ingrese su signo zodiacal (Sin tilde): ");
			
			int Byte = 0;
			String cadena = "";
			while(   ( Byte = System.in.read() )  != '\n'  )
			{
				if( Byte != '\r' )
					cadena += (char)Byte;
			}
			cadena = cadena.toLowerCase();
			switch(cadena) {
				case "aries":
					ps.println("Naciste en Marzo o Abril");
					break;
				case "tauro":
					ps.println("Naciste en Abril o Mayo");
					break;
				case "geminis":
					ps.println("Naciste en Mayo o Junio");
					break;
				case "cancer":
					ps.println("Naciste en Junio o Julio");
					break;
				case "leo":
					ps.println("Naciste en Julio o Agosto");
					break;
				case "virgo":
					ps.println("Naciste en Agosto o Septiembre");
					break;
				case "libra":
					ps.println("Naciste en Septiembre o Octubre");
					break;
				case "escorpio":
					ps.println("Naciste en Octubre o Noviembre");
					break;
				case "sagitario":
					ps.println("Naciste en Noviembre o Diciembre");
					break;
				case "capricornio":
					ps.println("Naciste en Diciembre o Enero");
					break;
				case "acuario":
					ps.println("Naciste en Enero o Febrero");
					break;
				case "Picis":
					ps.println("Naciste en Febrero o Marzo");
				default:
					ps.println("Eso no existe flaco.");
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
