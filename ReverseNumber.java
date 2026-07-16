import java.util.*;
class ReverseNumber
{
    public static void main(String args[])
    {
        int n, digit=0, reverse=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        n = sc.nextInt();
        while(n>0)
        {
            digit = n % 10;                     //getting last digit 
            reverse = reverse*10 + digit;       //adding digit in reverse form
            n=n/10;                             //
        }
        System.out.println("Reverse of the number is : " + reverse);
    }
}