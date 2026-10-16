package Assignment2;
import java.util.*;
public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter annual income");
        double income=sc.nextDouble();

        double tax;

        if(income<=250000){
            tax=0;
        }else if(income<=500000){
            tax=income*0.20;
        }else if(income<=100000){
            tax=income*0.40;
        }else{
            tax=income*0.30;
        }
        sc.close();
    }
}
