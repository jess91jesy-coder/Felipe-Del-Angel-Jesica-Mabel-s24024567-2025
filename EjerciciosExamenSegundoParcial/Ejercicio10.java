import java.util.Scanner;
public class Ejercicio10{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int[] numeros=new int[10];
	System.out.println("Ingrese los números: ");
	for(int i=0;i<10;i++){
		System.out.print("Numero " + (i+1) + " : ");
		numeros[i]=sc.nextInt();
	}
	System.out.println("\nNumeros en orden inverso: ");
	for(int i=9;i>=0;i--){
		System.out.println(numeros[i]);
	}
	sc.close();
	}
}