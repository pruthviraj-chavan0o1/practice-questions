package string_Methods;
import java.util.*;
public class printtheStringWordByword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String s ="My Name Is Suyash";


        s=s+" ";
        String Word="";

        for(int i=0; i<s.length();i++){
            char c=s.charAt(i);


            if(c != ' '){
                Word=Word+c;
            }
            else{
                char ch=Word.charAt(0);
                char ch1=Character.toUpperCase(ch);
                Word=ch1
                System.out.println(Word);
                Word="";
            }
        }
    }
}
