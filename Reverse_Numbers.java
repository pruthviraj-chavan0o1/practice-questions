import java.util.*;
public class Reverse_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");

        int number=sc.nextInt();

        int Reverse_Numbers=0;

        while(number!=0){

            int digit = number %10;
            Reverse_Numbers=Reverse_Numbers*10+digit;

            number=number/10;

        }
        System.out.println("reverse"+Reverse_Numbers);

    }
}
