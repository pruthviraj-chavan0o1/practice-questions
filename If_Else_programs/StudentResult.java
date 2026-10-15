package If_Else_programs;


import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 35 && marks <= 100) {
            System.out.println("Student is Pass");
        } else if (marks >= 0 && marks < 35) {
            System.out.println("Student is Fail");
        } else {
            System.out.println("Invalid marks");
        }

        sc.close();
    }
}

