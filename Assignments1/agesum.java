package Assignments1;
import java.util.*;
public class agesum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter age of first person: ");
        int age1 = sc.nextInt();

        System.out.println("Enter age of second person: ");
        int age2 =sc.nextInt();

        int sum=age1+age2;

        System.out.println("sum of their ages =" + sum);
        sc.close();
    }
}
