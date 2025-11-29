import java.util.Scanner;
public class Ejercicio9{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double[]calificaciones=new double[6];
	double suma=0,promedio;
	System.out.println("Ingresa las calificaciones de los estudiantes: ");
	for(int i=0;i<6;i++){
		System.out.print("Calificación estudiante " +(i+1) + " : ");
		calificaciones[i]=sc.nextDouble();
		suma+=calificaciones[i];
	}
	promedio=suma/6;
		System.out.println("Promedio final: " + promedio);
	sc.close();
	}
}

	