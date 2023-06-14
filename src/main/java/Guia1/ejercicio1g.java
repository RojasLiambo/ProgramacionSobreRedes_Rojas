package tp;

public class ejercicio1g {
	
	    public static void main() {
	        System.out.print("Ingresa tu signo zodiacal: ");
	        String signo = System.console().readLine();
	        
	        switch (signo.toLowerCase()) {
	            case "aries":
	                System.out.println("Tu mes de nacimiento es Marzo/Abril");
	                break;
	            case "tauro":
	                System.out.println("Tu mes de nacimiento es Abril/Mayo");
	                break;
	            case "geminis":
	                System.out.println("Tu mes de nacimiento es Mayo/Junio");
	                break;
	            case "cancer":
	                System.out.println("Tu mes de nacimiento es Junio/Julio");
	                break;
	            case "leo":
	                System.out.println("Tu mes de nacimiento es Julio/Agosto");
	                break;
	            case "virgo":
	                System.out.println("Tu mes de nacimiento es Agosto/Septiembre");
	                break;
	            case "libra":
	                System.out.println("Tu mes de nacimiento es Septiembre/Octubre");
	                break;
	            case "escorpio":
	                System.out.println("Tu mes de nacimiento es Octubre/Noviembre");
	                break;
	            case "sagitario":
	                System.out.println("Tu mes de nacimiento es Noviembre/Diciembre");
	                break;
	            case "capricornio":
	                System.out.println("Tu mes de nacimiento es Diciembre/Enero");
	                break;
	            case "acuario":
	                System.out.println("Tu mes de nacimiento es Enero/Febrero");
	                break;
	            case "piscis":
	                System.out.println("Tu mes de nacimiento es Febrero/Marzo");
	                break;
	            default:
	                System.out.println("Signo zodiacal no reconocido");
	        }
	    }
	}


