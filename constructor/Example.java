package constructor;

public class Example {

    public Example() {
        this(10);
        System.out.println("no....");
    }

    public Example(int a) {
        this(true);
        System.out.println("int....");
    }

    public Example(boolean b) {
        super();
        System.out.println("boolean...");
    }

    public static void main(String[] args) {
        Example e = new Example();
    }
}