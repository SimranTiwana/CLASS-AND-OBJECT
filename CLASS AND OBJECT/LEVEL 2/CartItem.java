import java.util.Scanner;

public class CartItem {
    String itemName;
    double price;
    int quantity;

    Scanner sc = new Scanner(System.in);

    void add() {
        System.out.print("Enter item name: ");
        itemName = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();
        System.out.println("Item added to cart!");
    }

    void remove() {
        itemName = null;
        price = 0;
        quantity = 0;
        System.out.println("Item removed from cart!");
    }

    void display() {
        double totalCost = price * quantity;
        if (itemName != null) {
            System.out.println("Item: " + itemName);
            System.out.println("Quantity: " + quantity);
            System.out.println("Price per item: " + price);
            System.out.println("Total Cost: " + totalCost);
        } else {
            System.out.println("Cart is empty.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartItem cart = new CartItem();
        int choice;

        do {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Total Cost");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    cart.add();
                    break;
                case 2:
                    cart.remove();
                    break;
                case 3:
                    cart.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}
