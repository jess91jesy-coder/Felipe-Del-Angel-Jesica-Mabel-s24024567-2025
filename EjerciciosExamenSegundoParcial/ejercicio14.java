public class Ejercicio14 {
	public static void main(String[] args) {
               String[] nombres = {"Marcos", "Matilde", "Paty", "Javier"};
	    int[][] sueldos = {
            {540, 540, 760},    // Sueldos de Marcos
            {200, 220, 250},    // Sueldos de Matilde
            {760, 760, 760},    // Sueldos de Paty
            {605, 799, 810}     // Sueldos de Javier
        };             
	  int[] totalAcumulado = new int[nombres.length];
        
       
        int totalGeneral = 0;
        
               int mayorIngreso = -1;
        String nombreMayorIngreso = "";

        System.out.println("--- Reporte de Ingresos Acumulados ---");
        
        
        for (int i = 0; i < nombres.length; i++) {
            int acumuladoEmpleado = 0;
            
                       for (int j = 0; j < sueldos[i].length; j++) {
                acumuladoEmpleado += sueldos[i][j];
            }
            
                        totalAcumulado[i] = acumuladoEmpleado;
            
           
            totalGeneral += acumuladoEmpleado;

            
            System.out.println(nombres[i] + ": " + acumuladoEmpleado);
            
            
            if (acumuladoEmpleado > mayorIngreso) {
                mayorIngreso = acumuladoEmpleado;
                nombreMayorIngreso = nombres[i];
            }
        }
        
        System.out.println("-------------------------------------");

               System.out.println(" Total pagado en sueldos a todos los empleados (3 meses): " + totalGeneral);
        
               System.out.println(" Empleado con el mayor ingreso acumulado:");
        System.out.println("   Nombre: " + nombreMayorIngreso);
        System.out.println("   Monto: " + mayorIngreso);
    }
}