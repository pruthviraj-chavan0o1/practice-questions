public class max_number_if_else_if {
    public static void main(String[]args){
        int a=10;
        int b=20;
        int c=30;

        if(a>b && a>c){
            System.out.println("number a 10 greater");
        }else if(b>a &&b>c){
            System.out.println("number 20 is greater");
        }else if(c>a && c>b){
            System.out.println("number c 30 is greater");
        }else{
            System.out.println("Not found");
        }
    }
}
