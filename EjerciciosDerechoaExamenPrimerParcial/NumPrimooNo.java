import java.util.Scanner;
public class NumPrimooNo{
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();
        System.out.println("El numero ingresado es: " + numero);
        if (numero <= 1) {
            System.out.println(numero + " NO es primo (los numeros menores o iguales a 1 no son primos).");
        } else {
            boolean esPrimo;
            switch (numero) {
                case 2:
                case 3:
                case 5:
                case 7:
                case 11:
                case 13:
                case 17:
                case 19:
                    esPrimo = true;
                    break;
                default:
                    if (numero % 2 == 0) {
                        esPrimo = false;
                    } else if (numero % 3 == 0) {
                        esPrimo = false;
                    } else if (numero % 5 == 0) {
                        esPrimo = false;
                    } else if (numero % 7 == 0) {
                        esPrimo = false;
                    } else if (numero % 11 == 0) {
                        esPrimo = false;
                    } else {
                        esPrimo = true;
                    }
                    break;
            }

            if (numero > 1) {
                if (esPrimo) {
                    System.out.println(numero + " es un numero primo.");
                } else {
                    System.out.println(numero + " NO es un numero primo.");
                }
            }
        }

        entrada.close();
    }
}
