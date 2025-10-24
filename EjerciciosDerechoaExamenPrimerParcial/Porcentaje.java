import java.util.Scanner;
public class Porcentaje{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	double porcentajehom, porcentajemuj;
	int hombres,mujeres,total;

		System.out.println("Ingresa la cantidad de mujeres");
		mujeres=sc.nextInt();
		System.out.println("Ingresa la cantidad de hombres");
		hombres=sc.nextInt();
		total=mujeres+hombres;
		porcentajehom=(hombres*100.0)/total;
		porcentajemuj=(mujeres*100.0)/total;
		System.out.println("El total  de hombres y mujeres es: " + total + " total");
		System.out.println("El porcentaje de hombres es: " + porcentajehom + " %");
		System.out.println("El porcentaje de mujeres es: " + porcentajemuj + " %");
	}
}
	