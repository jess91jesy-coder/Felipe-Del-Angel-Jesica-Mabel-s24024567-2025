import java.util.Scanner;
public class NumParoNon{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Ingrese un numero: ");
	int numero=sc.nextInt();
	System.out.println("El numero ingresado es: " + numero);
	System.out.println(numero % 2 == 0 ? "El numero es Par." : "El numero No es Par.");
	sc.close();
	}
}