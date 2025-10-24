import java.util.Scanner;
public class UniversidadCalificaciones{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Ingrese la nota numerica (0.0 - 5.0): ");
	double nota = sc.nextDouble();
		if (nota >= 0.0 && nota <= 1.0) {
		System.out.println("Valoracion: P (Pesimo)");
		}else if (nota > 1.0 && nota <= 2.0) {
		System.out.println("Valoracion: M (Mal)");
		}else if (nota > 2.0 && nota <= 2.9) {
		System.out.println("Valoracion: R (Regular)");
		}else if (nota >= 3.0 && nota <= 4.0) {
		System.out.println("Valoracion: B (Bien)");
		}else if (nota > 4.0 && nota <= 5.0) {
		System.out.println("Valoracion: E (Excelente)");
		}else{
		System.out.println("Nota no disponible intente de nuevo");
		}
		sc.close();
	}
}