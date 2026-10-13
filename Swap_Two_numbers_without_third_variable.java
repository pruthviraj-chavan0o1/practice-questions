public class Swap_Two_numbers_without_third_variable {
    public static void main(String[] args){
        int a=10;
        int b=20;

        System.out.println("Before Swapping a=" +a + "and b="+b);

        //swapping withiout usin third variable

        a=a+b;//a=30
        b=a-b;//b=10
        a=a-b;//a=20

       
        System.out.println("after Swapping a="+a+"and b="+b);
    }
}
