
 import java.util.Scanner;
public class MaxOf_Two_Numbers {

 
 public static void main(String[] args){

    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter first number");
    int a=Sc.nextInt();

    System.out.println("Enter second number");
    int b=Sc.nextInt();

    if(a>b)
        System.out.println(a+ "is a max");

    else
        System.out.println(b+"is a max");


 }
}
