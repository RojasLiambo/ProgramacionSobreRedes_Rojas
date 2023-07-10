
package guia1;

import java.io.IOException;
import java.io.PrintStream;

public class Guia1 {
    public static void main(String[] args) {
        // TODO code application logic here
    	menu(false);
        
        
    }
    
    public static void menu(boolean fallo){
		PrintStream ps = new PrintStream( System.out );
        try {
        	if(fallo) {
        		ps.println("Ingrese el  NÚMERO  de ejercicio, ingrese el  NÚMERO  0 para salir: ");
        	}else {
        		ps.println("Ingrese el número de ejercicio, 0 para salir: ");
        	}
			
			ps.println("1: Ejercicio 1");
            ps.println("2: Ejercicio 2 ");
            ps.println("3: Ejercicio 3 ");
            ps.println("4: Ejercicio 4");
            
			int Byte = 0;
			try{
				String cadena = lecturaDatos();
				int numej = Integer.parseInt(cadena) ;
			
	                        switch(numej){
	                            case 1:
	                                Ejercicio1 ej1 = new Ejercicio1();
	                                break;    
	                            case 2:
	                            	Ejercicio2 ej2 = new Ejercicio2();
	                                break;
	                            case 3:
	                                Ejercicio3 ej3 = new Ejercicio3();
	                                break;
	                            case 4:
	                                Ejercicio4 ej4 = new Ejercicio4();
	                                break;
	                            case 0:
	                            	ps.println("Finalizado");
	                            	break;
	                            default:
	                                ps.println("Número de ejercicio inválido");
	                                
	                        }
	                        if(numej != 0) {
	        					menu(false);
	        			}
			}catch(NumberFormatException e) {
				ps.println("Tenes que ingresar un número, lee bien.");
			    
				menu(true);
			}
				
        
			//ps.println(  (char)System.in.read()  ) ;
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
