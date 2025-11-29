import java.util.Scanner;

public class Ejercicio3{

    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);
        double saldoAdeudo = 1000.00;         int opcion;
        boolean continuar;

        System.out.println("Bienvenido al Cajero Automático de Energía Eléctrica ");

        do {
           	 mostrarMenu(saldoAdeudo);

            
           	 System.out.print("Ingrese el número de la opción deseada (1-4): ");
                       if (scanner.hasNextInt()) {
                		opcion = scanner.nextInt();
           	      } else {
                System.out.println(" Opción no válida. Por favor, ingrese un número.");
                scanner.next();                
		 continue; 
            }

                  scanner.nextLine();

         	 switch (opcion) {
                case 1:
                      consultarAdeudo(saldoAdeudo);
                      break;
                case 2:
                       saldoAdeudo = pagarServicio(saldoAdeudo, scanner, "Pago del Mes");
                       break;
                case 3:
                   
                       saldoAdeudo = pagarServicio(saldoAdeudo, scanner, "Pago de Adeudo");
                       break;
                case 4:
                   
                      System.out.println("\n Gracias por usar el servicio. ¡Hasta pronto!");
                      scanner.close(); // Cerrar el scanner antes de salir
                      return; 
                      default:
                    System.out.println(" Opción inválida. Por favor, elija una opción entre ");
           		 }

                        if (opcion >= 1 && opcion <= 3) {
               			 System.out.print("\n¿Desea realizar otra operación? (s/n): ");
               			 String respuesta = scanner.nextLine().trim().toLowerCase();
               			 continuar = respuesta.equals("s");

                		if (!continuar) {
                   			 System.out.println("\nGracias por usar el servicio. ¡Hasta pronto!");
                    			 break; 
                		}
           		 } else {
                		continuar = true;             }

       	 }while(continuar);

                	scanner.close();
    }

      public static void mostrarMenu(double adeudo) {
        System.out.println("\n--- Menú de Operaciones ---");
        System.out.printf("Adeudo Actual: $%.2f\n", adeudo); // Mostrar el adeudo
        System.out.println("1. Consulta");
        System.out.println("2. Pago del mes");
        System.out.println("3. Pago de adeudo");
        System.out.println("4. Salir");
        System.out.println("---------------------------");
    }

       public static void consultarAdeudo(double adeudo) {
        System.out.println("\n *Opción 1: Consulta*");
        System.out.printf("Su adeudo actual es: $%.2f\n", adeudo);
    }

       public static double pagarServicio(double adeudo, Scanner scanner, String tipoPago) {
        System.out.printf("\n *Opción %s: %s*\n", tipoPago.contains("Mes") ? "2" : "3", tipoPago);

        if (adeudo <= 0) {
            System.out.println(" ¡Felicidades! Usted no tiene adeudos pendientes.");
            return adeudo;
        }

        double montoAPagar;
        System.out.printf("Su adeudo es de $%.2f. Ingrese el monto a pagar: ", adeudo);

                if (scanner.hasNextDouble()) {
            montoAPagar = scanner.nextDouble();
        } else {
            System.out.println(" Monto no válido. Operación cancelada.");
            scanner.next(); 
            return adeudo;
        }

                scanner.nextLine();

        if (montoAPagar <= 0) {
            System.out.println(" El monto a pagar debe ser positivo. Operación cancelada.");
            return adeudo;
        }

        if (montoAPagar > adeudo) {
            System.out.printf("El monto ingresado ($%.2f) es mayor que el adeudo total ($%.2f).\n", montoAPagar, adeudo);
            System.out.println("Se aplicará el pago solo por el monto del adeudo.");
            montoAPagar = adeudo;     
	  }

        double nuevoAdeudo = adeudo - montoAPagar;

        System.out.println("\n** Recibo de Pago **");
        System.out.printf("Monto Pagado: $%.2f\n", montoAPagar);
        System.out.printf("Adeudo Anterior: $%.2f\n", adeudo);
        System.out.printf("Nuevo Adeudo: $%.2f\n", nuevoAdeudo);
        System.out.println("¡Pago realizado con éxito!");

        return nuevoAdeudo;
    }
}