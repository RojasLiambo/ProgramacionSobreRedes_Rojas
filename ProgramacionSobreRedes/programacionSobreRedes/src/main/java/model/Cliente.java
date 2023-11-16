package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;


public class Cliente extends Thread{
	 private PrintStream ps;
	 private BufferedReader Reader;
	 private InputStreamReader inputSt;
	 private Socket sockCli;
	 private String Direccion = "127.0.0.1";
	 private int Port = 5050;
	 private colores EYC;
	 private boolean salir;
	 
	 public Cliente() {
			
		}
	 public void ClienteOn() {
			run();
		}
	 public void run() {
		 try {
		    sockCli = new Socket(Direccion, Port);
		    inputSt = new InputStreamReader(sockCli.getInputStream());
			Reader = new BufferedReader(inputSt);
			ps = new PrintStream(sockCli.getOutputStream());
			EYC = new colores();
			
			Thread hilo1 = new Thread( new Runnable() {
				public void run() {
					while(!salir)
					{
						try {
			                BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
			                while (!salir) {                    
			                    String mensaje = lector.readLine();
			                    if (mensaje.equals("/salir")) 
			                    {
			                    	Reader.close();
			                    	CloseConexion();
			                    }else
			                    {
			                    	ps.println(mensaje);
			                    }
			                }
			            } catch (IOException e) {
			            	CloseConexion();
			            }
					}
				}
			});
			
			hilo1.start();
			
			String mensaje;
			
			while((mensaje = Reader.readLine()) != null) {
				EYC.mensaje(mensaje);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
	 public void CloseConexion() {
			salir = true;
			
	        try {
	        	Reader.close();
	        	ps.close();
	            if (!sockCli.isClosed())
	            {
	            	sockCli.close();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		}
}

	
