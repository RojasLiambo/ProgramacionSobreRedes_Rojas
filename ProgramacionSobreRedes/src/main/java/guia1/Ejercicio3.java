package guia1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Ejercicio3 {
	public Ejercicio3() throws IOException {
		PrintStream ps = new PrintStream( System.out );
		ps.println("Seleccione el ejercicio: ");
        ps.println("a: Crear un archivo");
        ps.println("b: Lista de números");
        ps.println("c: Lista de números pares hasta el 1000");
        ps.println("d: Leer lista creada");
        ps.println("e: Quitar impares de una lista de pares");
        ps.println("f: Lista de números primos hasta el 1000");
        ps.println("g: Letras con ñ");
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
		File error;
		FileWriter fw = null;
		PrintStream ps = new PrintStream(System.out );
		
		error = new File("EJ3a.log");

		try {
			fw = new FileWriter( error ,false); // Trabaja como un STREAM y administra FILE que sean Escribibles
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter pw = new PrintWriter(fw);
			ps.println("Inserte algo");
			
			pw.println(leer());
			
			try {
				fw.flush();
				pw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void Ej2() {
		File error;
		FileWriter fw = null;
		PrintStream ps = new PrintStream(System.out );
		
		error = new File("EJ3b.log");
		
		try {
			fw = new FileWriter( error ,false); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int seguir = 1;
		String ingresado;
		PrintWriter pw = new PrintWriter(fw);
		while(seguir == 1) {

			ps.println("Inserte algo, ponga terminar para finalizar: ");
			ingresado = leer();
			
			if(ingresado.equals("terminar")) {
				seguir = 0;
				ps.println("Finalizado");
			}else {
				try {
					pw.println(Integer.parseInt(ingresado));
				}
				catch(java.lang.NumberFormatException e) {
					
				}
			}

		}
		try {
			fw.flush();
			pw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Ej3() {
		File error;
		FileWriter fw = null;
		PrintStream ps = new PrintStream(System.out );
		
		error = new File("numeros.log");
		ps.println("Lista creada :)");
		try {
			fw = new FileWriter( error ,false); // Trabaja como un STREAM y administra FILE que sean Escribibles
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


			
			PrintWriter pw = new PrintWriter(fw);
			for(int i = 0 ; i <= 1000; i+=2) {
				pw.println(i);
			}
			
			try {
				fw.flush();
				pw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void Ej4() {
		PrintStream ps = new PrintStream(System.out );
		File numeros = new File("numeros.log");
		
		String texto="";
		try {
			FileReader fr = new FileReader(numeros);
			BufferedReader br = new BufferedReader( fr );
			
			String linea ="";
			while( (linea = br.readLine() ) !=  null)
			{
				texto += "\n" + linea;
			}		
			ps.println(texto);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void Ej5() {
		File numeros = new File("numeros.log");
		
		PrintStream ps = new PrintStream(System.out );
		
		
		String texto="";
		try {
			FileReader fr = new FileReader(numeros);
			BufferedReader br = new BufferedReader( fr );
			
			String linea ="";
			while( (linea = br.readLine() ) !=  null)
			{
				if(Integer.parseInt(linea)%2 == 0) {
					texto += "\n" + linea;
				} else {
					ps.println("wtf un numero impar en una lista de impares: " +Integer.parseInt(linea));
				}
				
			}		
			ps.println(texto);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Ej6() {
		File numeros = new File("numeros.log");
		File primos = new File("../primos.dat");
		FileWriter fw = null;
		PrintStream ps = new PrintStream(System.out );
		

		try {
			fw = new FileWriter( primos ,false); // Trabaja como un STREAM y administra FILE que sean Escribibles
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			PrintWriter pw = new PrintWriter(fw);
			ps.println("Lista de primos hecha :)");
			try {
				fw.flush();
				pw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			String texto="";
			try {
				FileReader fr = new FileReader(numeros);
				BufferedReader br = new BufferedReader( fr );
				int numero = 0, contador = 0;
				String linea ="";
				while( (linea = br.readLine() ) !=  null)
				{
					numero = Integer.parseInt(linea);
					if(numero%2 == 0 && numero != 1 && numero != 0) {
						for(int i=1 ; i <= numero; i++) {
							if(numero%i == 0) {
								contador += 1;
							}
						}
						if(contador == 2) {
							// El número es primo
							texto += "\n" + linea;
						}else {
							// El número no es primo
						}
						
					} else {
						//Numero 1, 0 o impar
					}
					
				}		
				ps.println(texto);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	
		
	
	
	public void Ej7() {
		FileWriter fw = null;
		File caracteres = new File("caracteres.dat");
		PrintStream ps = new PrintStream(System.out );
		

		try {
			fw = new FileWriter( caracteres ,false); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int seguir = 1;
		String ingresado;
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println("añicos");
		pw.println("niño");
		pw.println("montaña");
		pw.println("otoño");
		pw.println("moño");
		pw.println("piña");
		pw.println("leña");
		pw.println("cumpleaños");
		pw.println("campaña");
		pw.println("muñeca");
		
		
		try {
			fw.flush();
			pw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mostrarLista(caracteres, fw);
		arreglarFichero(caracteres, fw);
		
	}
	
	public String mostrarLista(File caracteres, FileWriter fw)
	{
		PrintStream ps = new PrintStream(System.out );
		String texto="";
		try {
			FileReader fr = new FileReader(caracteres);
			BufferedReader br = new BufferedReader( fr );
			
			String linea ="";
			while( (linea = br.readLine() ) !=  null)
			{
				
				texto += "\n" + linea;
			}		
			ps.println("Fichero original: ");
			ps.println(texto);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return texto;
	}
	
	public String arreglarFichero(File caracteres, FileWriter fw) {
		PrintStream ps = new PrintStream(System.out );
		String texto = "";
		try {
			FileReader fr = new FileReader(caracteres);
			BufferedReader br = new BufferedReader( fr );
			
			String linea ="";
			while( (linea = br.readLine() ) !=  null)
			{
				if(linea.contains("ñi")) {
					texto += "\n" + linea.replaceAll("ñ", "n");
				}else {
					texto += "\n" + linea.replaceAll("ñ", "ni");
				}
			}		
			ps.println("Fichero arreglado: ");
			ps.println(texto);
			caracteres.delete();
			
			caracteres = new File("caracteres.dat");
			try {
				fw = new FileWriter( caracteres ,false); 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			PrintWriter pw = new PrintWriter(fw);
			pw.print(texto);
			try {
				fw.flush();
				pw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return texto;
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
