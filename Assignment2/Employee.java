package Assignment2;
import java.util.*;
public class Employee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter Employee salary");
        double salary=sc.nextDouble();

        System.out.println("enter employee working year");
        int year=sc.nextInt();

        double bonus;


        if(year>=10){
            bonus=salary*0.20;
        }else if(year>=5){
            bonus=salary*0.10;
        }else if(year>=1){
            bonus=salary*0.5;
        }else{
            bonus=0;
        }
        System.out.println("employee salary = Rs. "+salary);
        System.out.println("Employee amout = Rs."+ bonus);
        System.out.println("Employee salry Rs."+(salary+bonus));
            sc.close();
}
    }

