import java.util.Scanner;
public class InversionCapital{
	public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	double monto,total,ganancia;
	System.out.println("Ingresa el monto del capital");
	monto=sc.nextDouble();
	ganancia=monto*0.2;
	total=ganancia + monto;
	System.out.println("La ganancia es: " + ganancia);
	System.out.println("El monto total es: " + total);
	}
}
	