package simpleprograms;
import java.util.Scanner;
public class Andoperatorprogram {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any numer");
        int number= sc.nextInt();

        if((number%5==0) &&(number%2==0)){
            System.out.println("the number"+number+"is divisable  by 5 and even");
        }else{
            System.out.println("Not..");
        }
    }
    
    }

