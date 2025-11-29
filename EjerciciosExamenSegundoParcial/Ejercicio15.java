import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] paises = new String[4];
    double[][] temps = new double[4][3]; 
    double[] promedio = new double[4];

        System.out.println("REGISTRO DE TEMPERATURAS");
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingresa el nombre del pais " + (i+1) + ": ");
            paises[i] = sc.nextLine();

            System.out.println("Ingresa sus 3 temperaturas mensuales:");
            for (int j = 0; j < 3; j++) {
                System.out.print("Temperatura " + (j+1) + ": ");
                temps[i][j] = sc.nextDouble();
            }
            sc.nextLine();
        }

        System.out.println("PAISES Y TEMPERATURAS");
        for (int i = 0; i < 4; i++) {
            System.out.print(paises[i] + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print(temps[i][j] + "  ");
            }
            System.out.println();
        }
        double mayorPromedio = 0;
        String paisMayor = "";

        for (int i = 0; i < 4; i++) {
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += temps[i][j];
            }
            promedio[i] = suma / 3;

            if (promedio[i] > mayorPromedio) {
                mayorPromedio = promedio[i];
                paisMayor = paises[i];
            }
        }

        System.out.println("TEMPERATURA MEDIA TRIMESTRAL");
        for (int i = 0; i < 4; i++) {
            System.out.println(paises[i] + ": " + promedio[i]);
        }

        System.out.println("El país con la temperatura media más alta es: " + paisMayor);
    }
}