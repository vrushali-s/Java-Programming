import java.util.*;
class CountDigits
{
    public static void main(String args[])
    {
        long num,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        num = sc.nextLong();
        while(num>0)
        {
            count++;
            num = num/10;
        }
        System.out.println("Number of digits = " + count);

    }
}