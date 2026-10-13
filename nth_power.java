import java.util.Scanner;

public class nth_power {
    public static void main(String[]args){
        //int number=4;
        //System.out.println((int )Math.pow(4, 3));

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number and i will sqrt");
        int n=sc.nextInt();
        System.out.println((int) Math.sqrt(n));
        System.out.println((int)Math.cbrt(n));

        //Math.pi

        int radious=7;
        //area of circle
        System.out.println("Area of circle having radious="+ radious+"is" +(Math.PI+radious*radious));



    }
}
