package model;


import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;

public class Servidor{
	private ArrayList<Conexion> Conexions;
	private ServerSocket sockSrv;
	private PrintStream ps;
	private colores Colores;
	private boolean salir;
	protected int port = 5050;

	public Servidor() {
		Conexions = new ArrayList<Conexion>();
		salir = false;
		ps = new PrintStream(System.out);
		Colores = new colores();
	}

	public void ServerOn() {
		hiloServidor.start();
		ps.println(Colores.ANSI_RED+"ESPERANDO A EL / LOS CLIENTES: ");
	}
	
	Thread hiloServidor = new Thread(
				new Runnable() {
					public void run() {
						try {
							sockSrv = new ServerSocket(port);
				            while(!salir){
				            	Socket Cliente = sockSrv.accept();
				            	Conexion conn = new Conexion(Cliente);
				            	Conexions.add(conn);
				            	for(Conexion c : Conexions) {
				                	c.run();
				                }
				            }
						} catch (Exception ex) {
				        	DesconectarServer();
				        }
					}
				}, "InicioDelServer"
			);	
	
	class Conexion extends Thread{
		private Socket Cliente;
		private BufferedReader Reader;
		private PrintStream ps;
		private String Nickname;
		private colores Colores;
		private String usuarioColor;
		
		public Conexion(Socket Cli) {
			this.Cliente = Cli;
			
			
			usuarioColor = Colores.ANSI_RED;
			
			
			try {
				ps = new PrintStream(Cliente.getOutputStream(), true);
				Reader = new BufferedReader(new InputStreamReader(Cliente.getInputStream()));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		public void run() {
			Thread Servicio = new Thread(new Runnable() {
						public void run() {
							try {
								
								Colores = new colores();
								
								ps.println(colores.ANSI_PURPLE + "Ingresa un nickname: " + colores.ANSI_RESET);
								
								Nickname = Reader.readLine();
								Colores.mensaje(Colores.ANSI_BLUE + Nickname + Colores.ANSI_GREEN + "Se conecto al servidor" + Colores.ANSI_RESET);
								Broadcast(Colores.ANSI_GREEN + Nickname + " se unió al chat" + "\n" + Colores.ANSI_RESET);
								String msg;
								while ((msg = Reader.readLine()) != null) {
				                    if (msg.startsWith("/nick ")) {
				                        String[] partir = msg.split(" ", 2);
				                        if (partir.length == 2) {
				                        	Broadcast(Colores.ANSI_GREEN + Nickname + " cambió su nick a "+ partir[1] + Colores.ANSI_RESET);
				                        	Colores.mensaje(Colores.ANSI_PURPLE + Nickname + Colores.ANSI_GREEN +" cambió su nombre a " + Colores.ANSI_YELLOW + partir[1] + Colores.ANSI_RESET);
				                            Nickname = partir[1];
				                            ps.println(Colores.ANSI_YELLOW + "Ahora te llamás "+Nickname+ Colores.ANSI_RESET);
				                        }else{
				                        	ps.println(Colores.ANSI_RED+ "No se cambió tu nombre de usuario. "+ Colores.ANSI_RESET);
				                        }
				                    }else if(msg.startsWith("/quit")){
				                    	Broadcast(Colores.ANSI_YELLOW + Nickname + "se ha desconectado" + Colores.ANSI_RESET);
				                    	CerrarConexion();
				                    }else{
				                    	Broadcast(usuarioColor + Nickname + ": "+ "\n" + "> " +msg+ Colores.ANSI_RESET);
				                    }
				                }
							}catch(IOException e) {
								CerrarConexion();
							}
							
						}
					}, "ServicioConexion"
				);
			Servicio.start();
		}
		
		public void MandarPaquete(String packeteDeTexto) {
			ps.println(packeteDeTexto);
		}
		
		public void CerrarConexion(){
			try{
            	Reader.close();
            	ps.close();
                if (!Cliente.isClosed()) {
                    Cliente.close();
                }
            }catch(IOException e){
            	e.printStackTrace();
            }
		} 
	}
	
	public void DesconectarServer() {
		try {
			salir = true;
            if (!sockSrv.isClosed()) {
            	sockSrv.close();
            }
            for (Conexion c : Conexions) {
                c.CerrarConexion();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	public void Broadcast(String msg) {
		for(Conexion c : Conexions) {
			if(c != null) {
				c.MandarPaquete(msg);
			}
		}
	}
	
	
	
}
