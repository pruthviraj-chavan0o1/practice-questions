package simpleprograms;
import java.util.*;

public class example2 {

    static String OriginalUsername = "Pruthvi";
    static String OriginalPassword = "Pruthvi123";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ur username");
        String username = sc.next();

        System.out.println("Enter Your Password");
        String Password = sc.next();

        if ((OriginalUsername.equals(username)) && (OriginalPassword.equals(Password))) {
            System.out.println("Login Success..!");
        } else {
            System.out.println("Please try again...");
        }
    }
}