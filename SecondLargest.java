import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if((a>=b && a<=c) || (a<=b && a>=c)){
            System.out.println("second largest ="+a);

        }else if((b>=a &&b<=c)|| (b<=a && b>=c)){
            System.err.println("Second largest = "+b);
        }else{System.out.println("second largest= "+c);

        }
        sc.close();
    }
}
