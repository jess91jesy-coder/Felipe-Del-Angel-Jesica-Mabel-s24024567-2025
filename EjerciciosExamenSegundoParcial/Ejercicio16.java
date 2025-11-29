import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[][] ropa = new String[3][3];

        System.out.println("REGISTRO DE ARTICULOS");
        for (int i = 0; i < 3; i++) {
            System.out.println("Articulo " + (i+1));
            System.out.print("Nombre (Camisa, Zapato, Pantalon): ");
            ropa[i][0] = sc.nextLine();

            System.out.print("Talla: ");
            ropa[i][1] = sc.nextLine();

            System.out.print("Color: ");
            ropa[i][2] = sc.nextLine();
        }

        System.out.println("TABLA DE ARTICULOS");
        System.out.println("Articulo\tTalla\tColor");
        for (int i = 0; i < 3; i++) {
            System.out.println(ropa[i][0] + "\t" + ropa[i][1] + "\t" + ropa[i][2]);
        }
    }
}