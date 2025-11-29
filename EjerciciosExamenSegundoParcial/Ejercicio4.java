import java.util.Scanner;
public class Ejercicio4{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int saldo=5000,retiro;
	String continuar="si";
	System.out.println("Saldo actual: $ " + saldo);
	while(continuar.equalsIgnoreCase("si")){
	System.out.println("\nIngresa la cantidad a retirar: $");
	retiro=sc.nextInt();
	if(retiro>saldo){
		System.out.println("Saldo insuficiente");
		System.out.println("Saldo disponble: $ " + saldo);
	}else{
		saldo=saldo-retiro;	
		System.out.println("Retiro exitoso. Saldo actual: $ " + saldo);
	}
	sc.nextLine();
		
		System.out.println("\n¿Deseas realizar otro retiro? (si/no): ");
		continuar=sc.nextLine();
	}
		System.out.println("Gracias por usar el cajero");
	
	}
}
		
