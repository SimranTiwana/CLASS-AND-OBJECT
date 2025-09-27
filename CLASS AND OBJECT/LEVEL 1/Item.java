import java.util.Scanner;

public class Item {
    int Code;
    String name;
    double price;
    int quantity;
    double cost;

    void total() {
        cost = price * quantity;
    }

    void display() {
        System.out.println("ITEM INFO ---" );
        System.out.println("Item Code: " + Code);
        System.out.println("Item Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + cost);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item i = new Item();

        System.out.print("Enter item code: ");
        i.Code = sc.nextInt();

        System.out.print("Enter item name: ");
        i.name = sc.next();  

        System.out.print("Enter price: ");
        i.price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        i.quantity = sc.nextInt();

        i.total();
        i.display();
    }
}
