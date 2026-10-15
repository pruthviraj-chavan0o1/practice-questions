
package If_Else_programs;

public class MaxNumber {

    public static int getMaxNumber(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else
            return c;
    }

    public static void main(String[] args) {
        int max = getMaxNumber(10, 20, 30);
        System.out.println(max);
    }
}
