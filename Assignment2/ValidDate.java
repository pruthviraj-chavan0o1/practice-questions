package Assignment2;

import java.util.Scanner;

public class ValidDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        int daysInMonth = 0;

        if (year > 0 && month >= 1 && month <= 12) {

            if (month == 2) {
                if ((year % 400 == 0) ||
                    (year % 4 == 0 && year % 100 != 0)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
            } else if (month == 4 || month == 6 ||
                       month == 9 || month == 11) {
                daysInMonth = 30;
            } else {
                daysInMonth = 31;
            }

            if (day >= 1 && day <= daysInMonth) {
                System.out.println("Valid date.");
            } else {
                System.out.println("Invalid date.");
            }

        } else {
            System.out.println("Invalid date.");
        }

        sc.close();
    }
}