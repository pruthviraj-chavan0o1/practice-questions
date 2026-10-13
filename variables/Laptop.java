package variables;

public class Laptop {

    String companyName = "Dell";
    double price = 450000;
    long modelNumber = 3827387239289289L;
    static String color = "Black";

    public static void printLaptopData() {

        // Create object
        Laptop laptop1 = new Laptop();

        // Print instance variables
        System.out.println(laptop1.companyName);
        System.out.println(laptop1.price);
        System.out.println(laptop1.modelNumber);

        // Print static variable
        System.out.println(color);
    }

    public static void main(String[] args) {

        printLaptopData();

    }
}