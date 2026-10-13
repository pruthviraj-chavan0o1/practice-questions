package hr_section;

import java.util.Scanner;

public class University {

    static String universityName = "SPPU";

    String studentName;
    int rollNumber;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        University student1 = new University();

        System.out.print("Enter first student name: ");
        student1.studentName = sc.nextLine();

        System.out.print("Enter first student roll number: ");
        student1.rollNumber = sc.nextInt();

        sc.nextLine(); 

        University student2 = new University();

        System.out.print("Enter second student name: ");
        student2.studentName = sc.nextLine();

        System.out.print("Enter second student roll number: ");
        student2.rollNumber = sc.nextInt();

        System.out.println("\nStudent Information ");

        System.out.println("University: " + universityName);

        System.out.println("Student 1 Name: " + student1.studentName);
        System.out.println("Student 1 Roll Number: " + student1.rollNumber);

        System.out.println("Student 2 Name: " + student2.studentName);
        System.out.println("Student 2 Roll Number: " + student2.rollNumber);

        ;
    }
}

