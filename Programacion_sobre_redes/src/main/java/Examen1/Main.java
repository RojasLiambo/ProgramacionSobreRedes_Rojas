/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Logger;




/**
 *
 * @author 
 */
public class Main {
    
    private static final Logger LOG = Logger.getLogger(Main.class.getName());
    
    /**
     * SOLO PREPARAR EL ARCHIVO (CON ORIENCION A OBJETOS) Y LUEGO LLAMAR AL FUNCIONAMIENTO DEL PROGRAMA
     * @param args 
     */
    public static void main(String[] args) {
        
        try {/*Este try lo que hace es crear un nuevo archivo Juegos.scv, 
        	 y reemplaza en el archivo la separacion de "+" a ";" */
        	File archivoNuevoLOLCITO = new File("juegos.scv");
            PrintWriter escritor = new PrintWriter(archivoNuevoLOLCITO);
        	FileReader lectorArch = new FileReader("juegos.dat");
            BufferedReader pasadorTexto = new BufferedReader(lectorArch);
        	          
            String lineaPartida;
           

            while ((lineaPartida = pasadorTexto.readLine())!= null) {
                String LineaBien = lineaPartida.replace("+", "; ");
                System.out.println(LineaBien);
                escritor.println(LineaBien);               
            }
            
           
            pasadorTexto.close();
            escritor.close();
        	/*este catch no pudimos resolverlo, pero crea el crash (en teoria) y le imprime los errores*/
        } catch (IOException error) {
            File Arch = new File("crash.log");
            FileReader lectorArch;
			try {
				lectorArch = new FileReader("crash.log");
				BufferedReader pasadorTexto = new BufferedReader(lectorArch);
				PrintWriter escritor = new PrintWriter(Arch);
				System.out.println(error);
				escritor.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				lectorArch = new FileReader("crash.log");
				BufferedReader pasadorTexto = new BufferedReader(lectorArch);
				PrintWriter escritor = new PrintWriter(Arch);
				System.out.println(error);
				System.out.println(e);
				escritor.close();
			}
            
			
 
            
            
                  	
        } 
    }  
}