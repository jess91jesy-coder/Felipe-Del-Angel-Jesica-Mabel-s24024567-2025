import java.util.Scanner;
public class Ejercicio8{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int mes;
	double ahorro=0,aporteMensual=500,interesMensual=0.09;
	System.out.println("==AHORRO MENSUAL CON INTERES DEL 9%==");
	for(mes=1;mes<=12;mes++){
		ahorro=(ahorro + aporteMensual) * (1 + interesMensual);
		System.out.printf("Mes %d: $%.2f%n",mes,ahorro);
	}
	System.out.printf("Total ahorrado al final del año: $%.2f%n", ahorro);
	}
}
	
