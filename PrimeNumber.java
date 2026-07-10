import java.util.*;
class PrimeNumber{
    public static void main(String args[]){
        int num;
        boolean isPrime= true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        num = sc.nextInt();
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}