package Assignments1;
import java.util.*;
public class RemainingBalance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your balance: ");
        double balance = sc.nextDouble();

        System.out.println("Enter amount spent: ");
        double spent = sc.nextDouble();

        double remaining = balance -spent;

        System.out.println("Remaining balance = " + remaining);
        
    }
}
