package Assignment2;
import java.util.*;
public class LArgestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();

        System.out.println("Enter second number");
        int b =sc.nextInt();

        System.out.println("Enter third number");
        int c=sc.nextInt();

        if(a>=c){
            if(a>=c){
                System.out.println(a+"a is a greater");

            }else{
                System.out.println(c+"is a greater");
            }

            }else{
                if(b>=c){
                    System.out.println(b+"is a greater");

                }else{
                    System.out.println(c+"is a greater");

                }
        }
        sc.close();
    }
}
