package simpleprograms;

public class orOperator {
    public static void main(String[] args) {

        int tnumber = 30;

        if ((tnumber % 5 == 0) || (tnumber % 3 == 0)) {
            System.out.println("The number is divisible by 5 or 3");
        } else {
            System.out.println("Not");
        }
    }
}