import java.util.Scanner;
public class LLamadaTelefonica{
	public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Ingresa el tiempo de llamada: ");
	int min=sc.nextInt();
	int costo;
        if (min <= 3) {
            costo = 10;
        } else {
            costo = 10 + (min - 3);
        }
        System.out.println("El costo total de la llamada es: N$" + costo);
    }
}
