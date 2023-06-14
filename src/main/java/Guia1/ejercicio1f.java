package tp;

public class ejercicio1f {
	    public static void ejercicioF() {
	        // Precio del artículo
	        System.out.print("Ingrese el precio del artículo: ");
	        double precio = Double.parseDouble(System.console().readLine());

	        // Planes de pago
	        System.out.println("Planes de pago:");
	        System.out.println("1. 100% al contado. Descuento del 10%.");
	        System.out.println("2. 50% al contado y el resto en 2 cuotas iguales. Incremento del 10%.");
	        System.out.println("3. 25% al contado y el resto en 5 cuotas iguales. Incremento del 15%.");
	        System.out.println("4. Totalmente financiado en 8 cuotas. Incremento del 25%.");

	        // Selección del plan
	        System.out.print("Seleccione el plan de pago (1-4): ");
	        int plan = Integer.parseInt(System.console().readLine());

	        // Cálculo del precio final según el plan
	        double precioFinal;
	        switch (plan) {
	            case 1:
	                precioFinal = precio * 0.9;
	                System.out.printf("Precio final: %.2f", precioFinal);
	                break;
	            case 2:
	                double cuota = (precio * 1.1) / 2;
	                precioFinal = precio * 1.1;
	                System.out.printf("Precio final: %.2f%n", precioFinal);
	                System.out.printf("Valor de las cuotas: %.2f", cuota);
	                break;
	            case 3:
	                cuota = (precio * 1.15) / 5;
	                precioFinal = precio * 1.15;
	                System.out.printf("Precio final: %.2f%n", precioFinal);
	                System.out.printf("Valor de las cuotas: %.2f", cuota);
	                break;
	            case 4:
	                double primeraCuota = (precio * 1.25 * 0.6) / 4;
	                double ultimaCuota = (precio * 1.25 * 0.4) / 4;
	                precioFinal = precio * 1.25;
	                System.out.printf("Precio final: %.2f%n", precioFinal);
	                System.out.printf("Valor de las primeras 4 cuotas: %.2f%n", primeraCuota);
	                System.out.printf("Valor de las últimas 4 cuotas: %.2f", ultimaCuota);
	                break;
	            default:
	                System.out.println("Plan de pago inválido.");
	                break;
	        }
	    }
	}


