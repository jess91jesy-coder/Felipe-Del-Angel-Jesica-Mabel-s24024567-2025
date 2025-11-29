import java.util.Scanner;
public class Ejercicio7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int i,numero;
		System.out.println("Ingresa un numero entero: ");
		numero=sc.nextInt();
		System.out.println("Tabla de multiplicar del " + numero + " : ");
		for(i=1;i<=10;i++){
			System.out.println(numero + " x " + i + " = " + (numero*i));
		}
		
	}
}
	
	