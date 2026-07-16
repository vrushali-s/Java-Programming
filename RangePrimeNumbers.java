import java.util.*;
class RangePrimeNumbers{
    public static void main(String args[]){
        int start,end;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start number : ");
        start = sc.nextInt();
        System.out.println("Enter end number : ");
        end = sc.nextInt();
        for(int j=start;j<=end;j++)
        {
            boolean isPrime= true;
            for(int i=2;i<=Math.sqrt(j);i++){
                if(j%i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(j+ ", ");
            }
        }
        
    }
}