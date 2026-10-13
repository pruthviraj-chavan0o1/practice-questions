package notes.loops.for_loops;
import java.util.*;
public class numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number and i will generate the sum of the digits");
        int num=sc.nextInt();

        int sum=0;
        while(num>0){
            int last=num%10;
            sum=sum+last;
            num=num/10;
        }
        System.out.println("the addition of digit is"+sum);
    }
}
