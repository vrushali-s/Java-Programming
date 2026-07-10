import java.util.*;
class ReverseString{
    public static void main(String args[]){
        String nomral;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        nomral = sc.nextLine();
        StringBuilder reverse = new StringBuilder(nomral).reverse();
        System.out.println("Reverse string is : "+ reverse);

    }
}