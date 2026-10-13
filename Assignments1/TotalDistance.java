package Assignments1;
import java.util.*;
public class TotalDistance{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter distance of first trip: ");
    double distance1=sc.nextDouble();

    System.out.println("enter distance of second trip: ");
    double distance2=sc.nextDouble();

    double total=distance1 +distance2;

    System.out.println("Total distance travelled =" +total);
    sc.close();
}
}