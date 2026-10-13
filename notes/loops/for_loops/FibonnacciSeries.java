package notes.loops.for_loops;

public class FibonnacciSeries {
    public static void main(String[] args) {
        int firstNumber=0;
        int secondNumber=1;

        int nextNumber;

        for(int i=1; i<=10;i++){
            System.out.println(firstNumber);

            nextNumber= firstNumber+secondNumber;

            //swapping
            firstNumber=secondNumber;
            secondNumber=nextNumber;
        }
    }
}
