package constructor;

public class Demo1 {
  public Demo1(){
    System.out.println("Constructor get called");
  }
  public Demo1(int x){
    System.out.println("int constructor get called");
  }
  public static void main(String[] args) {
    new Demo1();
    new Demo1(10);
  }
}
