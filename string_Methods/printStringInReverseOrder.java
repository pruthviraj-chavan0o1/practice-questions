package string_Methods;
import java.util.*;
public class printStringInReverseOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        // String s="pruthvi";
        String s=sc.next();

        for(int i=s.length()-1; i>=0;i--){
            System.out.println(s.charAt(i));
        }

        }
}
