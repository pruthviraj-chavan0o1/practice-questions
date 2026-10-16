package Assignment2;
import java.util.*;
public class Vowell {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a charracyer");
        char ch=sc.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' ||ch=='E' ||ch=='I' || ch=='O' || ch=='U'){
            System.out.println("Character is a vowel");

        }else if((ch>='a' && ch<='z')||
    (ch>='A' && ch<='Z')){
        System.out.println("Character is a consonant");
    }else{
        System.out.println("is not Alphabet");
    }
    sc.close();

    }
}
