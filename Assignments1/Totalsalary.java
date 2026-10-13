package Assignments1;
import java.util.*;
public class Totalsalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter salary of first employee: ");
        double salary1=sc.nextDouble();

        System.out.println("Enter salary of second employee");
        double salary2=sc.nextDouble();
        double total=salary1 + salary2;

        System.out.println("Total salary = "+total);
        sc.close();
    }
}
