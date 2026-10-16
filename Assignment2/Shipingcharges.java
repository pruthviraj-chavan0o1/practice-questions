package Assignment2;
import java.util.*;
public class Shipingcharges {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter order amount");
        double amount=sc.nextDouble();

        System.out.println("Enter delievry type (standard/Express):");
        String delieveryTtype=sc.nextLine();

        double Shipingcharge=0;

        if(amount>=1000){
            if(delieveryTtype.equalsIgnoreCase("standard")){
                Shipingcharge=0;

            }else if(delieveryTtype.equalsIgnoreCase("Express")){
                Shipingcharge=100;
            }else{
                System.out.println("Invalid delievery type");
                sc.close();
                return;
            }
         
        }else{
            if(delieveryTtype.equalsIgnoreCase("standard")){
                Shipingcharge=50;
            }else if(delieveryTtype.equalsIgnoreCase("Express")){
                Shipingcharge=150;
            }else{
                System.out.println("Invalid delievery type");
                sc.close();
                return;
            }
            System.out.println("Shiping charge rs: "+ Shipingcharge);
            System.out.println("total amount rs: "+(amount+Shipingcharge));
            sc.close();
        }

        
    }
}
