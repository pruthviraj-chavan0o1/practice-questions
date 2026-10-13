// package notes.loops;
// import java.util.*;
// // public class print1_to_5 {
// //     public static void main(String[]args){
// //         int start=1;
// //         int end=5;
// //         while(start<=end){
// //             System.out.println(start);
// //             start++;
// //         }
// //     }
// // }
// public class print{
//     Scanner sc=new Scanner(System.in);
    
// }
package notes.loops;

import java.util.Scanner;

public class print1_to_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = sc.nextInt();

        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        while (start <= end) {
            System.out.println(start);
            start++;
        }

        sc.close();
    }
}
