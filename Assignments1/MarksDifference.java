package Assignments1;
import java.util.*;
public class MarksDifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    

        System.out.println("Enter marks of first student: ");
        int marks1 = sc.nextInt();

        System.out.println("enter marks of second student: ");
        int marks2=sc.nextInt();

        int difference = marks1 - marks2;
        System.out.println("difference between marks =" +Math.abs(difference));
    }
}
