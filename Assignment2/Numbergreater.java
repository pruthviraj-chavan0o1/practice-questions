package Assignment2;
import java.util.*;
public class Numbergreater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first Number");
        int a=sc.nextInt();

        System.out.println("Enter a second Number");
        int b=sc.nextInt();

        if(a>b){
            System.out.println(a+" is a largest number");

    }else if(b>a){
        System.out.println(b+" is a greater number");

    }else{System.out.println("Both numbers are equal");}


    }
    
}
