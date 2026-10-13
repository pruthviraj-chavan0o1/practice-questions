package notes.loops;
import java.util.*;
public class Reverse_the_Number {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
    
        int m=num;
        int rev=0;

        while(m>0){
            int last=m%10;
            rev = (rev*10)+last;
            m=m/10;
        }
        System.out.println(rev);
    }
}
