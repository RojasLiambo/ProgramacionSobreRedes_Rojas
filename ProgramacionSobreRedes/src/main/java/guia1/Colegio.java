package guia1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
public class Colegio {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintStream ps = new PrintStream(System.out);
	
	
    private static String[] apellidos;
    private static String[] nacionalidades;
    private static int numAlumnos;

    public Colegio(int capacidadMaxima) {
        apellidos = new String[capacidadMaxima];
        nacionalidades = new String[capacidadMaxima];
        numAlumnos = 0;
    }

    public void addAlumno(String apellido, String nacionalidad) {
        try {
			apellidos[numAlumnos] = apellido;
			nacionalidades[numAlumnos] = nacionalidad;
	        numAlumnos++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }

    public void showAll() {
        if(numAlumnos == 0) {
            ps.println("No hay alumnos registrados.");
        } else {
            for( int i = 0 ; i < numAlumnos ; i++ ) {
                String nacionalidad = nacionalidades[i];
                int count;
				try {
					count = cantidadDeAlumnosPorNacionalidad(nacionalidad);
					ps.println("Nacionalidad: " + nacionalidad + ", Número de alumnos: " + count);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        }
    }
    
    public void showNacionalidad(String nacionalidad) {
        int count = cantidadDeAlumnosPorNacionalidad(nacionalidad);
        if(count > 0) {
        	ps.println("Nacionalidad: " + nacionalidad + ", Número de alumnos: " + count);
        } else {
        	ps.println("No hay alumnos con esa nacionalidad.");
        }
    }

    public void cuantos() {
        if(numAlumnos == 0) {
        	ps.println("No hay alumnos registrados.");
        } else {
            int numNacionalidades;
			try {
				numNacionalidades = contarNacionalidadesDistintas();
	            ps.println("Número de nacionalidades diferentes: " + numNacionalidades);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }

    public void borra() {
        apellidos = new String[apellidos.length];
        nacionalidades = new String[nacionalidades.length];
        numAlumnos = 0;
    }

    private int cantidadDeAlumnosPorNacionalidad(String nacionalidad) {
        int count = 0;
        for( int i = 0 ; i < numAlumnos ; i++ ) {
            if(nacionalidades[i].equals(nacionalidad)) {
                count++;
            }
        }
        return count;
    }

    private int contarNacionalidadesDistintas() {
        int count = 0;
        for( int i = 0 ; i < numAlumnos ; i++ ) {
            boolean esDistinto = true;
            for (int j = 0; j < i; j++) {
                if(nacionalidades[i].equals(nacionalidades[j])) {
                    esDistinto = false;
                    break;
                }
            }
            if(esDistinto) {
                count++;
            }
        }
        return count;
    }
}
