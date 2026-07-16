/*Anagram - Two strings are called anagrams if they contain the same characters  with the 
same frequency but arranged in a different order.*/
import java.util.*;
class AnagramCheck
{
    public static void main(String args[])
    {
        String str1, str2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings : ");
        str1 = sc.nextLine().toLowerCase();
        str2 = sc.nextLine().toLowerCase();
        if(str1.length()==str2.length()){
            System.out.println("Strings are not Anagram.");
            return;
        }
        char arr1[]= str1.toCharArray();
        char arr2[]= str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2))
        {
            System.out.println("Strings are Anagram.");
        }
        else
        {
            System.out.println("Strings are not Anagram.");
        }
       

    }
}