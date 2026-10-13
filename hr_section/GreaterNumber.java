package hr_section;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (1-10): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (1-10): ");
        int b = sc.nextInt();
        System.out.print("Enter third number (1-10): ");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is the greatest number.");
        }
        else if (b > a && b > c) {
            System.out.println(b + " is the greatest number.");
        }
        else if (c > a && c > b) {
            System.out.println(c + " is the greatest number.");
        }
        else {
            System.out.println("Two or more numbers are equal.");
        }
        
    }
}