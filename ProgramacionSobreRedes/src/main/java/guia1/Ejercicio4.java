package guia1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;

public class Ejercicio4 {
	PrintStream ps = new PrintStream(System.out);
	public Ejercicio4() throws IOException {
		PrintStream ps = new PrintStream( System.out );
		ps.println("Seleccione el ejercicio: ");
        ps.println("a: Lista de numeros");
        ps.println("b: Colegio");
        ps.println("c: Días de la semana");
        ps.println("d: Furvol");
        ps.println("e: Bolas de dos colores");
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
		int seguir = 1, numero;
		List<Integer> numeros = new ArrayList<Integer>();
		while(seguir == 1) {
			ps.println("Ingrese un número, -99 para terminar.");
			numero = Integer.parseInt(leerValores());
			if(numero != -99) {
				numeros.add(numero);
			}else{
				seguir = 0;
			}
			
		}
		mostrarResultado(numeros);
	}
	public int sumarValores(List<Integer> numeros) {
		int suma = 0;
		for(Integer num : numeros) {
			suma += num;
		}
		return suma;
	}
	public void mostrarResultado(List<Integer> numeros) {
		ps.println("Cantidad de números ingresados: "+numeros.size());
		ps.println("Suma de los valores: "+sumarValores(numeros));
		ps.println("Promedio de los valores: "+sumarValores(numeros)/numeros.size());
	}
	public String leerValores() {
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
	
	public void Ej2() {
		Colegio colegio = new Colegio(10);

        colegio.addAlumno("Rojas", "Español");
        colegio.addAlumno("Liambo", "Polaco");
        colegio.addAlumno("Fenoglio", "Italiano");
        colegio.addAlumno("Romaniello", "Italiano");
        colegio.addAlumno("Budman", "Ruso");

        colegio.showAll();

        ps.println("");

        colegio.showNacionalidad("España");

        ps.println("");

        colegio.cuantos();

        ps.println("");

        colegio.borra();

        colegio.showAll();
	}
	public void Ej3() {
		List<String> listDias = new ArrayList<>();
        listDias.add("Lunes");
        listDias.add("Martes");
        listDias.add("Miércoles");
        listDias.add(3, "Juernes");
        listDias.add("Jueves");
        listDias.add("Viernes");
        listDias.add("Sábado");
        listDias.add("Domingo");

        List<String> listaDos = new ArrayList<>(listDias);

        listDias.addAll(listaDos);

        ps.println("Elemento en la posición 3: " + listDias.get(3));
        ps.println("Elemento en la posición 4: " + listDias.get(4));
        ps.println("Primer elemento: " + listDias.get(0));
        ps.println("Último elemento: " + listDias.get(listDias.size() - 1));
        
        ps.println("");
        
        listDias.remove("Juernes");

        if (listDias.contains("Juernes")) {
            ps.println("Se eliminó 'Juernes' de la lista.");
        } else {
            ps.println("'Juernes' no se encontraba en la lista.");
        }
        
        ps.println("");

        ps.println("Contenido de la lista original:");

        Iterator<String> iterator = listDias.iterator();
        while (iterator.hasNext()) {
            ps.println(iterator.next());
        }

        String searchElement = "Lunes";
        boolean elementFound = listDias.stream()
                .map(String::toLowerCase)
                .anyMatch(e -> e.equals(searchElement.toLowerCase()));

        ps.println("");
        
        if (elementFound) {
            ps.println("Se encontró el elemento '" + searchElement + "' en la lista.");
        } else {
            ps.println("No se encontró el elemento '" + searchElement + "' en la lista.");
        }
        
        ps.println("");

        listDias.sort(String.CASE_INSENSITIVE_ORDER);

        ps.println("Contenido de la lista ordenada:");
        ps.print(listDias.stream().distinct().findFirst().orElse(""));
        for (int i = 1; i < listDias.size(); i++) {
            ps.print(", " + listDias.get(i));
        }
        ps.println();
    }
	
	
	public void Ej4() {
		List<String> jugadores = new ArrayList<>();
        List<String> jugadores2 = new ArrayList<>();

        jugadores.add("Jordi Alba");
        jugadores.add("Pique");
        jugadores.add("Busquets");
        jugadores.add("Iniesta");
        jugadores.add("Messi");

        ps.println("Nombres de los jugadores:");
        imprimirElementos(jugadores);

        ps.println();

        ps.println("¿Existe Neymar JR en la lista de jugadores?");
        boolean existeNeymar = jugadores.contains("Neymar JR");
        if (existeNeymar) {
        	ps.println("Sí, Neymar JR está en la lista.");
        } else {
        	ps.println("No, Neymar JR no está en la lista.");
        }

        ps.println();

        jugadores2.add("Pique");
        jugadores2.add("Busquets");

        ps.println("¿Todos los elementos de jugadores2 están en jugadores?");
        boolean todosEnJugadores = jugadores.containsAll(jugadores2);
        if (todosEnJugadores) {
        	ps.println("Sí, todos los elementos de jugadores2 están en jugadores.");
        } else {
        	ps.println("No, algunos elementos de jugadores2 no están en jugadores.");
        }

        ps.println();

        jugadores.addAll(jugadores2);

        ps.println("Unión de jugadores y jugadores2:");
        imprimirElementos(jugadores);

        ps.println();

        ps.println("Intentando agregar a Piqué nuevamente a jugadores:");
        boolean piqueAgregado = jugadores.add("Pique");
        if (piqueAgregado) {
        	ps.println("Piqué ha sido agregado a jugadores.");
        } else {
        	ps.println("Piqué no puede ser agregado a jugadores.");
        }
        
	}
	public void imprimirElementos(List<String> lista) {
        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            String jugador = iterator.next();
            System.out.println(jugador);
        }
    }
	
	public void Ej4e() {
        ps.println("Generador de números para apuestas en la bola de dos colores");
        ps.println("");

        int[] numerosRojos = generarNumerosRojos(6);
        int numeroAzul = generarNumeroAleatorio(1, 16);

        ps.println("Números de bolas rojas:");
        for (int numeroRojo : numerosRojos) {
            ps.print(numeroRojo + " ");
        }
        ps.println("");
        ps.println("Número de bola azul: " + numeroAzul);
	}
	public static int[] generarNumerosRojos(int cantidad) {
        int[] numerosRojos = new int[cantidad];
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            int numeroRojo;
            do {
                numeroRojo = generarNumeroAleatorio(1, 33);
            } while (existeNumero(numerosRojos, numeroRojo));

            numerosRojos[i] = numeroRojo;
        }

        return numerosRojos;
	 }
	public static boolean existeNumero(int[] numeros, int numero) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero) {
                return true;
            }
        }
        return false;
	 }
	public static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
	}
	
	//
	public void Ej5() {
        Set<String> conjunto1 = new HashSet<>();
        conjunto1.add("Provincia de Heilongjiang");
        conjunto1.add("Provincia de Zhejiang");
        conjunto1.add("Provincia de Jiangxi");
        conjunto1.add("Provincia de Guangdong");
        conjunto1.add("Provincia de Fujian");

        
        Set<String> conjunto2 = new HashSet<>();
        conjunto2.add("Harbin");
        conjunto2.add("Hangzhou");
        conjunto2.add("Nanchang");
        conjunto2.add("Guangzhou");
        conjunto2.add("Fuzhou");

        Map<String, String> mapa = new HashMap<>();
        Iterator<String> iterador1 = conjunto1.iterator();
        Iterator<String> iterador2 = conjunto2.iterator();

        while (iterador1.hasNext() && iterador2.hasNext()) {
            String clave = iterador1.next();
            String valor = iterador2.next();
            mapa.put(clave, valor);
        }

        
        Set<Map.Entry<String, String>> entradas = mapa.entrySet();
        for (Map.Entry<String, String> entrada : entradas) {
            String clave = entrada.getKey();
            String valor = entrada.getValue();
            System.out.println(clave + " = " + valor);
        }

        Set<String> claves = mapa.keySet();
        for (String clave : claves) {
            String valor = mapa.get(clave);
            System.out.println(clave + " = " + valor);
        }
	}
	
	public void Ej6() {
		
	}
	
	public void Ej7() {
		
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
