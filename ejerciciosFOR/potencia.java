import java.util.Scanner;
class potencia{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1, num2;
        double res=1;
        System.out.println("dame el numero base");
        num1=sc.nextInt();
        System.out.println("Dame el numero de potencia");
        num2=sc.nextInt();
        for(int i=1;i<=num2;i++){
            res=res*num1;
        }
        System.out.println(num1 + " elevado a la potencia " + num2 + " es " + res);
        sc.close();
    }
}