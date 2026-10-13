public class ThreeDigit {
    public static void main(String[] args) {

        int num = 393;

        if (num >= 100 && num <= 999) {
            System.out.println(num + " is a three-digit number");
        } else {
            System.out.println(num + " is not a three-digit number");
        }
    }
}