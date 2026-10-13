package string_Methods;
import java.util.*;
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any char");
        char ch=sc.next().charAt(0);
        
        if(Character.isLowerCase(ch)){
            System.out.println(Character.toUpperCase(ch));
        }
        else{
            System.out.println("Char is already Upper case ");
        }
    }
}
