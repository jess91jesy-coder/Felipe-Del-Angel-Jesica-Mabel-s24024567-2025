import java.util.Scanner;
public class Pulsaciones{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int numpulsaciones=220, edad=0;
		System.out.println("Ingresa la edad");
		edad=sc.nextInt();
		 numpulsaciones=(220-edad)/10;
		 System.out.println(" el numero de pulsaciones es: " + numpulsaciones);
	}
}