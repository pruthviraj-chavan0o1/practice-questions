import java.util.*;
public class SwapTwoNumbers {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a first number:");
    int a=sc.nextInt();

    System.out.println("enter a second number: ");
    int b=sc.nextInt();

    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("After Swapping:");
    System.out.println("First number ="+a);
    System.out.println("Second number="+b);
    sc.close();
   } 
}
