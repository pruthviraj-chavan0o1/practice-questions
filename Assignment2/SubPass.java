package Assignment2;
import java.util.*;
public class SubPass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter sub1 Marks");
        int a=sc.nextInt();

        System.out.println("Eter sub2 makrks");
        int b=sc.nextInt();

        System.out.println("enter sub3 marks");
        int c=sc.nextInt();

        if(a>35 && b>35 && c>35){
            System.out.println("passed");
        }else{
            System.out.println("Failed");
        }
        sc.close();
    }
}
