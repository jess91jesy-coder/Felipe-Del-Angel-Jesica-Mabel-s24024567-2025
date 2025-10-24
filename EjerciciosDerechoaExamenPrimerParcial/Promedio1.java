import java.util.Scanner;
public class Promedio1{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);	
	double calmateria1,calmateria2,calmateria3,promedio;
	System.out.println("Ingresa la calificacion de la materia1");
        calmateria1=sc.nextDouble();
	System.out.println("Ingrese la calificacion de la materia2");
        calmateria2=sc.nextDouble();
	System.out.println("Ingrese la calificacion de la materia3");
        calmateria3=sc.nextDouble();
	promedio=(calmateria1+calmateria2+calmateria3)/3;
	System.out.println("El promedio final es: " + promedio);
	}
}

	