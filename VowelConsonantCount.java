import java.util.*;
class VowelConsonantCount{
    public static void main(String args[]){
        String str;
        int vowel=0, consonant=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        str= sc.nextLine().toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowel++;
                }
                else{
                    consonant++;
                }
            }
        }
        System.out.println("Vowels : "+ vowel + "\nConsonants : " + consonant);
    }
}