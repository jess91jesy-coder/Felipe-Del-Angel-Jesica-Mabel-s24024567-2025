import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[][] atletas = new String[5][4];
    double[] tiempos = new double[5];

        System.out.println("REGISTRO DE ATLETAS");

        for (int i = 0; i < 5; i++) {
            System.out.println("Atleta " + (i+1));

            System.out.print("Nombre: ");
            atletas[i][0] = sc.nextLine();

            System.out.print("Apellido: ");
            atletas[i][1] = sc.nextLine();

            System.out.print("Especialidad: ");
            atletas[i][2] = sc.nextLine();

            System.out.print("Tiempo (s): ");
            tiempos[i] = sc.nextDouble();
            sc.nextLine();
        }

        double mejorTiempo = tiempos[0];
        int mejorIndex = 0;

        for (int i = 1; i < 5; i++) {
            if (tiempos[i] < mejorTiempo) {
                mejorTiempo = tiempos[i];
                mejorIndex = i;
            }
        }

        System.out.println("TABLA DE ATLETAS");
        System.out.println("Nombre\tApellido\tEspecialidad\tTiempo");
        for (int i = 0; i < 5; i++) {
            System.out.println(atletas[i][0] + "\t" + atletas[i][1] + "\t" +
                               atletas[i][2] + "\t" + tiempos[i]);
        }

        System.out.println("\nEl atleta con el mejor tiempo es: " +
                atletas[mejorIndex][0] + " " + atletas[mejorIndex][1] +
                " con " + mejorTiempo + " segundos.");
    }
}