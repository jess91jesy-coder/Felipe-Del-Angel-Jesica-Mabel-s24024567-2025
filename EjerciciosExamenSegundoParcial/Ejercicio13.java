import java.util.Scanner;
public class Ejercicio13 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	final int NUM_NIVELES = 3;
        final int NUM_IDIOMAS = 4;
        int[][] matrizAlumnos = new int[NUM_NIVELES][NUM_IDIOMAS];
	String[] nombresNiveles = {"Básico", "Medio", "Perfeccionamiento"};
        String[] nombresIdiomas = {"Inglés", "Francés", "Alemán", "Ruso"};
        final int TOTAL_ESTUDIANTES = 12;
	 System.out.println("--- REGISTRO DE ESTUDIANTES EN LA ACADEMIA ---");
         System.out.println("Se registrarán la ubicación de " + TOTAL_ESTUDIANTES + " estudiantes.");
		 for (int i = 0; i < TOTAL_ESTUDIANTES; i++) {
           		 System.out.println("\n--- Estudiante " + (i + 1) + " de " + TOTAL_ESTUDIANTES + " ---");
            		 int nivel = -1;
            	while (nivel < 0 || nivel >= NUM_NIVELES) {
                System.out.println("Indique el Nivel (0=Básico, 1=Medio, 2=Perfeccionamiento):");
                if (scanner.hasNextInt()) {
                    nivel = scanner.nextInt();
                } else {
                    System.out.println("Entrada no válida. Por favor ingrese un número.");
                    scanner.next(); // Limpiar el buffer
                }
            }

                    int idioma = -1;
            while (idioma < 0 || idioma >= NUM_IDIOMAS) {
                System.out.println("Indique el Idioma (0=Inglés, 1=Francés, 2=Alemán, 3=Ruso):");
                if (scanner.hasNextInt()) {
                    idioma = scanner.nextInt();
                } else {
                    System.out.println("Entrada no válida. Por favor ingrese un número.");
                    scanner.next(); 
                }
            }
            
                        matrizAlumnos[nivel][idioma]++;
            System.out.println("Registrado: Nivel " + nombresNiveles[nivel] + " en " + nombresIdiomas[idioma]);
        }

                System.out.println("\n=============================================");
        System.out.println("      RESUMEN FINAL DE ESTUDIANTES");
        System.out.println("=============================================");
        
        System.out.print("Nivel/Idioma |");
        for (String idiomaNombre : nombresIdiomas) {
                       System.out.printf("%10s |", idiomaNombre); 
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------------");

        
        for (int i = 0; i < NUM_NIVELES; i++) {
                       System.out.printf("%-11s  |", nombresNiveles[i]); 
            
            
            for (int j = 0; j < NUM_IDIOMAS; j++) {
                System.out.printf("%10d |", matrizAlumnos[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}