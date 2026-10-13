package string_Methods;
import java.util.*;
public class Demo6 {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("are u sure u want to delete");
    System.out.println("y/n");
    char input=sc.next().charAt(0);
    char c=Character.toLowerCase(input);
    if(c=='y')
        System.out.println("Datadeleted");
    else if(c=='n')
        System.out.println("Not deleted");
    else
        System.out.println("invalid input");
    
}
}