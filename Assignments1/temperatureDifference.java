package Assignments1;
import java.util.*;
public class temperatureDifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first temperature: ");
        double temp1=sc.nextDouble();

        System.out.println("enter second temp: ");
        double temp2=sc.nextDouble();

        double difference=Math.abs(temp1 -temp2);

        System.out.println("Difference between temperatures = "+difference);
        sc.close();
    }
}
