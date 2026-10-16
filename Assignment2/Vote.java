package Assignment2;
import java.util.*;
public class Vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a age");
        int age=sc.nextInt();

        if(age>18){
            System.err.println("Eligible for voting");

        }else{
            System.out.println("Not Eligible for voting");
        }
    }
}
