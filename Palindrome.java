import java.util.*;
class Palindrome{
    public static void main(String args[]){
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        str = sc.nextLine();
        String reverse = new StringBuilder(str).reverse().toString();
        if(str.equals(reverse))
            System.out.println("String is Palindrome.");
        else
            System.out.println("String is NOT Palindrome.");
    }
}