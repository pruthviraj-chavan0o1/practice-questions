// package notes;

import java.util.Scanner;

public class printMsg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many times you want to print: ");
        int end = sc.nextInt();

        int start = 1;

        while (start <= end) {
            System.out.println("Hello world");
            start++;
        }

        sc.close();
    }
}