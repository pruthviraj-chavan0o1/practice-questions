package If_Else_programs;
import java.util.Scanner;
import java.lang.reflect.Method;
public class Test1 {
    public static void main(String[] args) {
        String s1="aman";
        String s2="Aman";
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        String s3="deepak";
        String s4="sagar";
        System.out.println(s3.compareTo(s4));
    }
}
