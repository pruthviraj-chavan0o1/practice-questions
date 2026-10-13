package Assignments1;
import java.util.*;
public class PriceDifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter price of first product :");
        double price1 = sc.nextDouble();

        System.out.println("Enter price of second product: ");
        double price2 =sc.nextDouble();

        double difference = Math.abs(price1-price2);

        System.out.println("Difference between prices ="+ difference);
        sc.close();
    }
}
