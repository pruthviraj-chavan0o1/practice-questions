package Methods;

public class Demo {

    public static Employee getEmployeeData() {

        Employee e = new Employee();

        e.EmployeeId = 401;
        e.EmployeeName = "sharma";
        e.designation = "Developer";
        e.department = "dev";
        e.salary = 150000;

        return e;
    }

    public static void main(String[] args) {

        Employee e = getEmployeeData();

        System.out.println("Name of the employee is " + e.EmployeeName);
        System.out.println("Employee id " + e.EmployeeId);
        System.out.println("Designation " + e.designation);
        System.out.println("Department is " + e.department);
        System.out.println("Salary is " + e.salary);
    }
}