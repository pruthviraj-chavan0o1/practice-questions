package Assignment2;
import java.util.*;
public class TriangleType {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first side");
        int a=sc.nextInt();

        System.out.println("Enter second side");
        int b=sc.nextInt();

        System.out.println("Enter third side");
        int c=sc.nextInt();


        if(a<=0 || b<=0 || c<=0 ||a+b<=c ||b+c<=a || a+c<=b){
            System.out.println("Invalid Triangle");
        }else if(a==b && b==c){
            System.out.println("Equilateral triangle");
        }else if(a==b || b==c|| a==c){
            System.out.println("Ispsceless Triangle");
        }else{
            System.out.println("Scalen Triangle");
        }
        sc.close();
    }
}
