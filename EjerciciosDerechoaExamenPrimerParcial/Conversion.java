import java.util.Scanner;
public class Conversion{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double metros=0,pies=3.2808,pulgadas=39.3701;
		 System.out.println("Ingresa los metros:");
		 metros=sc.nextDouble();
		 pies=metros*3.2808;
		 pulgadas=metros*39.3701;
		System.out.println(metros + " metros equivalen a: " + pies + " pies");
		System.out.println(metros + " metros equivalen a: " + pulgadas + " pulgadas");

	}
}
