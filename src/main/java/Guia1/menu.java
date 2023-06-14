package tp;
	import java.io.Console;
import java.io.IOException;
import java.io.PrintStream;
import java.text.ParseException;

	public class menu {

	    public static void main(String[] args) throws IOException, ParseException {
	        
	        Console console = System.console();
	        PrintStream ps = System.out;
	        
	        String opcion = "";
	        String preguntas = "";
	        String opcion2 = "";
	        
	        while(!preguntas.equals("0")) {
	        	ps.println("selecciones una opcion:");
	        	ps.println("1.guia de preguntas 1");
	        	ps.println("2.guia de preguntas 2");
	            ps.println("0. Salir");
	            

	            preguntas = console.readLine();
	            switch (preguntas) {
	            case "1" :
	        while (!opcion.equals("0")) {
	            
	            ps.println("Seleccione una opción:");
	            ps.println("1. Calcular el valor del sueldo bruto");
	            ps.println("2. Calcular el valor del tercer ángulo de un triángulo");
	            ps.println("3. Calcular el perímetro de un cuadrado");
	            ps.println("4. Fahrenheit a grados celcius");
	            ps.println("5. segudos a tiempo completo");
	            ps.println("6. planes para pagar y sus resultados");
	            ps.println("7. signos zodiacales y sus nacimientos");
	            ps.println("0. salir");
	            

	            opcion = console.readLine();
	            
	            switch (opcion) {
	                
	                case "1":
	                	ejercicio1.tp1a();
	                    break;
	                    
	                case "2":
	                	ejercicio1b.ejercicio1B();
	                    break;
	                    
	                case "3":
	                	ejercicio1c.ejercicioC();
	                    break;
	                case "4":
	                ejercicio1d.ejercicioD();
	                break;
	                
	                case"5":
	                	ejercicio1e.ejercicioE();
	                	break;
	                	
	                case"6":
	                	ejercicio1f.ejercicioF();
	                	break;
	                	
	                case"7":
	                	ejercicio1g.main();
	                	break;
	                	
	                case "0":
	                    ps.println("¡Hasta pronto!");
	                    break;
	                    
	                default:
	                    ps.println("Opción inválida");
	            }
	            
	        }
	        	break;
	            case "2":

		            ps.println("Seleccione una opción:");
		            ps.println("1. Calcular el valor del sueldo bruto");
		            ps.println("2. Calcular el valor del tercer ángulo de un triángulo");
		            ps.println("3. Calcular el perímetro de un cuadrado");
		            ps.println("4. Fahrenheit a grados celcius");
		            ps.println("5. segudos a tiempo completo");
		            ps.println("6. planes para pagar y sus resultados");
		            ps.println("7. signos zodiacales y sus nacimientos");
		            ps.println("8. primo o no?");
		            ps.println("0. salir");
		            
	            	
	            	
		            opcion2 = console.readLine();
		            
		            switch (opcion2) {
		                
		                case "1":
		                	ejercicio2a.ejercicio2A();
		                    break;
		                    
		                case "2":
		                	ejercicio2b.ejercicio2B();
		                    break;
		                    
		                case "3":
		                	ejercicio2c.ejercicio2C();
		                    break;
		                case "4":
		                ejercicio2d.ejercicio2D();
		                break;
		                
		                case"5":
		                	ejercicio2e.ejercicio2E();
		                	break;
		                	
		                case"6":
		                	ejercicio2f.ejercicio2F();
		                	break;
		                	
		                case"7":
		                	ejercicio2g.ejercicio2G();
		                	break;
		                	
		                case"8":
							ejercicio2h.ejercicio2H();
		                break;
		                
		                case "0":
		                    ps.println("¡Hasta pronto!");
		                    break;
		                    
		                default:
		                    ps.println("Opción inválida");
		            }
		            break;
		        	case "0":
                    ps.println("¡Hasta pronto!");
                    break;
                    default:
                    	ps.println("opcion inválida");
	            }
	        	

	        }
	        }
	    
	    }
	

