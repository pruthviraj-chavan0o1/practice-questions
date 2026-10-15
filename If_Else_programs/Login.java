
package If_Else_programs;

import java.util.Scanner;

public class Login {

    public static String login(String username, String password) {

        String Original_Username = "admin";
        String Original_password = "admin123";

        if (username.equals(Original_Username) &&
            password.equals(Original_password))
            return "Login success";
        else
            return "try again...!";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username");
        String u = sc.next();

        System.out.println("Enter password");
        String p = sc.next();

        System.out.println(login(u, p));

        sc.close();
    }
}
