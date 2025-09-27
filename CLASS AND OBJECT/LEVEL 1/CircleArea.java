import java.util.Scanner;

public class Circle {
    double radius;
    double area;
    double circumference;

    void calculate() {
        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.print("Enter radius: ");
        c.radius = sc.nextDouble();
        c.calculate();
        c.display();
    }
}
