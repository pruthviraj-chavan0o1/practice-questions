package string_Methods;

import java.util.*;

public class Demo3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any char");
        char ch = sc.next().charAt(0);

        char c = Character.toUpperCase(ch);

        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println("ch is vowel");
        } 
        else {
            System.out.println("char is consonant");
        }
    }
}