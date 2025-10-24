import java.util.Scanner;
public class Circulo{
	public static void main(String args[]){
	double pi=3.1416,longitud=0,radio=0,area=0;
	Scanner leer=new Scanner(System.in);
		System.out.println("Ingresa el radio");
		radio=leer.nextDouble();
		longitud=2*pi*radio;
		area=pi*(radio*radio);
		System.out.println("La longitud es : " + longitud);
		System.out.println("El area es : " + area);
	}
}
		
		