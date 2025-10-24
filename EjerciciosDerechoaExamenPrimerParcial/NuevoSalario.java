import java.util.Scanner;
public class NuevoSalario{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	double SalarioTotal,aumento,salario;
	System.out.println("Ingrese el salario del trabajador");
	salario=sc.nextDouble();
	aumento=salario*0.25;
	SalarioTotal=salario + aumento;
	System.out.println("El aumento del trabajador es: " + "$" +aumento); 
	System.out.println("El salario total del trabajador es: " + "$" + SalarioTotal );
	}
} 