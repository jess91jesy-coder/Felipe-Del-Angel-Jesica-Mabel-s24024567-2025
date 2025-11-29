import java.util.Scanner;
public class Ejercicio12{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double[]ventas=new double[7];
	String[]dias={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
	double total=0,mayorVenta=0;
	int diaMayor=0;
	System.out.println("Ingresa las ventas diarias de la semana: ");
	for(int i=0;i<7;i++){
		System.out.print("Venta del: " + dias[i] + " : $ ");
		ventas[i]=sc.nextDouble();
		total+=ventas[i];
		if(ventas[i]>mayorVenta){
		   mayorVenta=ventas[i];
		   diaMayor=i;
		}
	}
	System.out.println("===REPORTE DE VENTAS===");
	System.out.println("Venta total de la semana: $ " + total);
	System.out.println("Dia con mayor venta : " + dias[diaMayor] + " con $ " + mayorVenta);
	sc.close();
	}
}
	