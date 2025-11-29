import java.util.Scanner;
public class Ejercicio6{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double suma=0,promedio,calificacion;
	int aprobados=0,reprobados=0;
	System.out.println("Ingresa las calificaciones de 5 alumnos (1-10): ");
	for(int i=1;i<=5;i++){
		System.out.println("calificacion alumno " + i + " : ");
		calificacion= sc.nextDouble();
		suma=suma+calificacion;
		if(calificacion>=6){
			aprobados++;
		}else{
			reprobados++;
		}
	}
	promedio=suma/5;
	System.out.println("Total aprobados: " + aprobados);
	System.out.println("Total reprobados: " + reprobados);
	System.out.println("Promedio del grupo: " + promedio);
	sc.close();
	}
}
		
		