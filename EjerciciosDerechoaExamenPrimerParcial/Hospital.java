import java.util.Scanner;
public class Hospital {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el presupuesto anual del hospital: ");
        double presupuesto = sc.nextDouble();

        double ginecologia = presupuesto * 0.40;
        double traumatologia = presupuesto * 0.30;
        double pediatria = presupuesto * 0.30;

        System.out.println("Presupuesto asignado a cada area");
        System.out.println("Ginecologia: $" + ginecologia);
        System.out.println("Traumatologia: $" + traumatologia);
        System.out.println("Pediatria: $" + pediatria);

        sc.close();
    }
}