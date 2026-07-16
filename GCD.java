import java.util.*;
class GCD
{
    public static void main(String args[])
    {
        int a,b,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find GCD : ");
        a=sc.nextInt();
        b=sc.nextInt();
        while(b!=0)
        {
            temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("GCD = " + a);

    }
}