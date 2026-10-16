package Assignment2;
import java.util.*;
public class LoginValidation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     String correctusername="user123";
     String correctpassword="pruthvi1431";

     System.out.println("Enter your username");
     String username=sc.nextLine();
     System.out.println("enter your password");
     String password=sc.nextLine();

     if(username.equals(username)){
        if(password.equals(password)){
            System.out.println("Enter your role: Admin/user");
            String role=sc.nextLine();

            if(role.equals("Admin")){
                System.out.println("Welcome admin");
            }else if(role.equals("user")){
                System.out.println("welcome user");
            }else{
                System.out.println("Invalid user role");
            }
                
            }else{
                System.out.println("Incorect username");
            }

        }else{System.out.println("Invalid pasword");}
        sc.close();
     }
     
    }

