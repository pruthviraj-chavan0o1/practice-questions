package notes.loops;
import java.util.*;
public class print_Product_1_to_5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int start=sc.nextInt();

        System.out.println("Enter second number");
         
        int end=sc.nextInt();
    
        int product=1;
        while(start<=end){
            product=product*start;
            start++;
        }
        System.out.println(product);
    }
}
