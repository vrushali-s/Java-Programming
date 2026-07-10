import java.util.*;
class Factorial{
    public static void main(String args[]){
        int factorial=1,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find its factorial : ");
        n= sc.nextInt();
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
        System.out.println("Factorial is : "+factorial);
    }
}