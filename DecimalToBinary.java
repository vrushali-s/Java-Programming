import java.util.*;
class DecimalToBinary
{
    public static void main(String args[])
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        num = sc.nextInt();
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary = " + binary);
    }
}