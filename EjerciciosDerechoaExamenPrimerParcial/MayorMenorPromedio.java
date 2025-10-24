import java.util.Scanner;
public class MayorMenorPromedio{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Ingrese el primer valor: ");
	double a=sc.nextDouble();
	System.out.print("Ingrese el segundo valor: ");
	double b=sc.nextDouble();
	System.out.print("Ingrese el tercer valor: ");
	double c=sc.nextDouble();
		if(a==b && b==c){
		System.out.println("Los tres valores son iguales.");
		}else{
		double mayor=Math.max(a, Math.max(b, c));
		double menor=Math.min(a, Math.min(b, c));
		double promedio=(a+b+c)/3;
		System.out.println("El mayor es: "+mayor);
		System.out.println("El menor es: "+menor);
		System.out.printf("El promedio es: "+promedio);
		}
	}
}