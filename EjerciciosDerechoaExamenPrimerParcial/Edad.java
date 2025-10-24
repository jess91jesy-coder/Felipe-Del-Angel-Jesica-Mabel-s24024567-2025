import java.util.Scanner;
public class Edad{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	int edad=0,añonacimiento,añoactual=2025;
	System.out.println("Ingresa tu año de nacimiento");
	añonacimiento=sc.nextInt();
	edad=añoactual-añonacimiento;
	System.out.println("La edad es : " + edad + " años ");
	}
}
		