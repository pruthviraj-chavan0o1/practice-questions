package Assignment2;
import java.util.*;
public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();

        System.out.println("Enter a second number");
        int b=sc.nextInt();

        System.out.println("Enter a third number");
        int c=sc.nextInt();

        if(a<=b && a<=c){System.out.println(a+"is a smallest number");

        }else if(b<=a && b<=c){
            System.out.println(b+"is a smallest number");

        }else{
            System.out.println(c+"is a smallest number");
        }
        sc.close();
    }
}
