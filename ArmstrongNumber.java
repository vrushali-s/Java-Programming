/* An Armstrong number is a number that is equal to the sum of each of its digits raised to the 
power of the total number of digits in the number */ 
import java.util.*;
class ArmstrongNumber{
    public static void main(String args[]){
        int num, original, count=0, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        num=sc.nextInt();
        original = num;
        while(num>0){       //counting the number of digits
            count++;
            num = num/10;
        }
        num=original;
        while(num>0){
            int digit = num % 10;       //extracting a single unit place digit
            sum += Math.pow(digit,count);
            num = num/10;
        }
        if(sum == original){
            System.out.println(original + " is Armstrong number.");
        }
        else{
            System.out.println(original + " is not Armstrong number.");
        }


    }
}