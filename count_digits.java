import java.util.*;

public class count_digits {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();

        if(num>=0 && num<=9){
            System.out.println(num+"is a single digit");
        }else if(num>=10 && num<=99){
            System.out.println(num+"is two digit");
        }else if(num>=100 && num<=999){
            System.out.println(num+"is three digit");
        }else{
            System.out.println("invalid input");
        }
    }
}
