import java.util.Scanner;
public class Tienda{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	double porcentaje,total, totalcompra,descuento;
	System.out.println("Ingrese el total de la compra : $");
	total=sc.nextDouble();
	descuento=total*0.15;
	totalcompra=total-descuento;
		System.out.println("Descuento: $ " + descuento);
		System.out.println("El total de la compra con descuento  es: $ " + totalcompra);
	}
}
	