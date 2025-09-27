import java.util.Scanner;

public class MobilePhone {
    String brand;
    String model;
    double price;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MobilePhone m = new MobilePhone();

        System.out.print("Enter brand: ");
        m.brand = sc.next();

        System.out.print("Enter model: ");
        m.model = sc.next();

        System.out.print("Enter price: ");
        m.price = sc.nextDouble();

        m.display();
    }
}
