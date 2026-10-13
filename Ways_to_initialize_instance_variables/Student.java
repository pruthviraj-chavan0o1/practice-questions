package Ways_to_initialize_instance_variables;

public class Student {

    int id;
    String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        // Object reference
        Student s1 = new Student(101, "Pruthviraj");

        s1.display();
    }
}