package string_Methods;

import java.util.*;

public class Demo4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any char");
        char ch = sc.next().charAt(0);

        if(Character.isLetter(ch)){
            System.out.println(ch+"is letter");
        }
        else if(Character.isDigit(ch)){
            System.out.println(ch+"is digit");
        }
        else{
            System.out.println(ch+"is special Symbol");
        }

    }
}