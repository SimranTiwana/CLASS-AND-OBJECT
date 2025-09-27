import java.util.*;

public class EmployeeData {
    String name;
    int id;
    double salary;

    EmployeeData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, id, salary: ");
        name = sc.nextLine();
        id = sc.nextInt();
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("EMPLOYEE INFO: " + name + " " + id + " " + salary);
    }

    public static void main(String[] args) {
        EmployeeData e = new EmployeeData(); 
        e.display(); 
    }
}
