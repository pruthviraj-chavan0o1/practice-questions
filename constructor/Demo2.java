package constructor;

public class Demo2 {
    public Demo2(){
        this(10.4);
        System.out.println("no para..");
    }
    public Demo2(double d){
        super();
        System.out.println("double para");
    }
    public static void main(String[] args) {
        Demo2 a=new Demo2();
    }
}
