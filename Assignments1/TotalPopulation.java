package Assignments1;
import java.util.*;
public class TotalPopulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first village population: ");
        int population1=sc.nextInt();

        System.out.println("enter second village population: ");
        int population2=sc.nextInt();

        int total = population1 + population2;

        System.out.println("Total population =" +total);
        sc.close();
    }
}
