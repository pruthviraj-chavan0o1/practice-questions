package Assignment2;
import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number: ");
        double a=sc.nextDouble();

        System.out.println("Enter second number: ");
        double b=sc.nextDouble();

        System.out.println("Enter operator(+,-,*,/): ");
       char op = sc.next().charAt(0);

       if(op=='+'){
        System.out.println("Result is: "+(a+b));
       }
       else if(op=='-'){
        System.out.println("result is: "+(a-b));

       }else if(op=='*'){
        System.out.println("Result is: "+(a*b));
       }else{
        System.out.println("Invalid operator");
       }
       sc.close();
    }
}
