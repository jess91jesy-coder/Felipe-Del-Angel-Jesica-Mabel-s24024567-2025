import java.util.Scanner;
public class CategoriaEmpleados{
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Categorias de empleados:");
	System.out.println("1. Categoria $20.000 por hora");
	System.out.println("2. Categoria $15.000 por hora");
	System.out.println("3. Categoria $10.000 por hora");
	System.out.println("4. Categoria $7.500 por hora");
	System.out.print("Ingrese la categoria del empleado (1-4): ");
	int categoria=sc.nextInt();
	System.out.print("Ingrese el numero de horas trabajadas durante el mes: ");
	int horasTrabajadas=sc.nextInt();
	double salarioPorHora=0;
		switch(categoria){
	case 1:
		salarioPorHora=20000;
		break;
	case 2:
		salarioPorHora=15000;
		break;
	case 3:
		salarioPorHora=10000;
		break;
	case 4:
		salarioPorHora=7500;
		break;
		default:
	System.out.println("Opcion no valida.");
	sc.close();
	return;
	}
	double salarioMensual=salarioPorHora*horasTrabajadas;
	double descuentoSalud=salarioMensual*0.072;
	double salarioConDescuento=salarioMensual-descuentoSalud;
	double subsidio=0;
	if(salarioMensual<1000000){
	subsidio=salarioMensual*0.15;
	}
	double salarioFinal=salarioConDescuento + subsidio;
	System.out.println("Detalles del salario");
	System.out.println("Salario mensual (Sin Descuentos): $" + salarioMensual);
	System.out.println("Descuento por salud: $" + descuentoSalud);
	System.out.println("Subsidio: $" + subsidio);
	System.out.println("Salario final: $" + salarioFinal);
	}
}