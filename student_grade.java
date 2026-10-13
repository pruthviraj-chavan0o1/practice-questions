import java.util.*;

public class student_grade {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a marks");
        int number=sc.nextInt();

        if(number<35 && number>0){
            System.out.println("fail");
        }
        else if(number<70 && number>35){
            System.out.println("pass");
        }else if(number>70 && number<100){
            System.out.println("distinction");
        }
    }
}
