package Assignment2;
import java.util.*;
public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter purchase amount");
        double amount=sc.nextDouble();

        System.out.println("are u a member (yes/no)");
        String membership=sc.next();

        double discount=0;

        if(amount>=5000){
            if(membership.equalsIgnoreCase("yes")){
                discount=20;
            }else{
                discount=10;}
            }else if(amount >=2000){
                if(membership.equalsIgnoreCase("yes")){
                    discount=10;

                }else{
                    discount=5;
            }
            
            }else{discount=0;
        }
        double discountAmount=amount*discount/100;
        double finalamount=amount*discountAmount;
        System.out.println("Discount: "+discount+"%");
        System.out.println("Discount amount: rs."+ discountAmount);
        System.out.println("final amount: "+finalamount);

        sc.close();
        
    }
    
}
