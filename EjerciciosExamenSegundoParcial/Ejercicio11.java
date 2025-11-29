import java.util.Scanner;
public class Ejercicio11{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int[]numeros=new int[8];
	System.out.println("Ingresa los numeros: ");
	for(int i=0;i<8;i++){
		System.out.print("Numero " + (i+1) + " : ");
		numeros[i]=sc.nextInt();
	}
	System.out.print("Ingrese el numero a buscar: ");
	int buscar=sc.nextInt();
	boolean encontrado=false;
	for(int i=0;i<8;i++){
		if(numeros[i]==buscar){
			encontrado=true;
		 	break;
		}
	}
	if(encontrado){
		System.out.println("El numero " + buscar + " encontrado en el arreglo. ");
	}else{
		System.out.println("El numero " + buscar + "No encontrado en el arreglo. ");
	}
	sc.close();
	}
}
	

	
		
	