import java.util.Scanner;
class piramide{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("dame un numero");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int a=1;a<=(2*i-1);a++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}