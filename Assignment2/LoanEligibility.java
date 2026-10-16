package Assignment2;
import java.util.*;
public class LoanEligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();

        System.out.println("Enter your salary");
        double salary=sc.nextDouble();

        System.out.println("Enter credit Score");
        int credit=sc.nextInt();

        if(age>=18 && age<=60 && salary>=25000 &&credit>=700){
            System.out.println("you are eligible for loan");

        }else{
           System.out.println("you are not Eligible for loan");
        }
        sc.close();
    }
}
