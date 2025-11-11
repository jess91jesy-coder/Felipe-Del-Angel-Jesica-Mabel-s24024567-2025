import java.util.Scanner;
class fizzbuzz{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num, i;
        for(i=1;i<=100;i++){
            System.out.println("dame un numero");
            num=sc.nextInt();
            if(num % 3==0 && num % 5==0){
            System.out.println("FizzBuzz");
            }else if(num % 5==0){
                System.out.println("Buzz");
            }else if(num % 3==0){
                System.out.println("Fizz");
            }else{
                System.out.println(num);
            }

            System.out.println();
        }
        sc.close();
    }
}