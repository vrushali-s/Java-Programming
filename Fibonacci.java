import java.util.*;
class Fibonacci{
    public static void main(String args[]){
        int num1=0, num2=1,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        n= sc.nextInt();
        System.out.print("Fibonacci Series : "+num1+ ", " + num2);
        for(int i=2;i<=n;i++){
            
            int num3=num1+num2;
            System.out.print(", "+ num3);
            num1=num2;
            num2=num3;
        }
    }
}