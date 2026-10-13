// package notes;

import java.util.Scanner;

public class Generate_Table_of_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the end value: ");
        int end = sc.nextInt();

        int start = 1;

        while (start <= end) {
            System.out.println(number + " * " + start + " = " + (number * start));
            start++;
        }

        sc.close();
    }
}