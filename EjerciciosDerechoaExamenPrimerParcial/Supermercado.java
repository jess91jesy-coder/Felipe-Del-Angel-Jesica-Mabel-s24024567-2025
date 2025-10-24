import java.util.Scanner;
public class Supermercado{
	public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese el total de la compra: ");
        double totalCompra = sc.nextDouble();
        System.out.print("Ingrese el número escogido al azar (0-100): ");
        int numero = sc.nextInt();
        double descuento;
        if (numero < 74) {
            descuento = totalCompra * 0.15;
        } else {
            descuento = totalCompra * 0.20;
        }
        System.out.println("Número escogido: " + numero);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar después del descuento: $" + (totalCompra - descuento));
        sc.close();
    }
}