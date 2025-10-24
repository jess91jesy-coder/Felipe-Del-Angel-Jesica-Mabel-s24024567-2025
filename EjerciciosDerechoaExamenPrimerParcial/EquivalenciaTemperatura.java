import java.util.Scanner;
public class EquivalenciaTemperatura{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	double Farenheit,Kelvin,temperatura;
	System.out.println("Ingresa la temperatura en grados centigrados");
	temperatura=sc.nextDouble();
	Farenheit=temperatura*9/5 + 32;
	Kelvin=temperatura+273.15;
		System.out.println("Temperatura en Farenheit: " + Farenheit + " Farenheit ");
		System.out.println("Temperatura en Kelvin: " + Kelvin + " Kelvin");
	}
}

	
	
