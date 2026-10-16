package Assignment2;

import java.util.Scanner;

public class EmployeePerformance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter performance score (0-100): ");
        int score = sc.nextInt();

        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();

        System.out.print("Enter project completion percentage: ");
        double completion = sc.nextDouble();

        if (score >= 0 && score <= 100 &&
            attendance >= 0 && attendance <= 100 &&
            completion >= 0 && completion <= 100) {

            if (attendance >= 75 && completion >= 80) {

                if (score >= 90) {
                    System.out.println("Rating: Excellent");
                } else if (score >= 75) {
                    System.out.println("Rating: Good");
                } else if (score >= 50) {
                    System.out.println("Rating: Average");
                } else {
                    System.out.println("Rating: Poor");
                }

            } else {
                System.out.println("Rating: Poor");
                System.out.println("Reason: Low attendance or project completion.");
            }

        } else {
            System.out.println("Invalid input. Enter values between 0 and 100.");
        }

        sc.close();
    }
}