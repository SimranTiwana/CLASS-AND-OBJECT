import java.util.Scanner;

public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    Scanner sc = new Scanner(System.in);

    void get() {
        System.out.print("Enter movie name: ");
        movieName = sc.nextLine();
        System.out.print("Enter seat number: ");
        seatNumber = sc.nextInt();
        System.out.print("Enter ticket price: ");
        price = sc.nextDouble();
        System.out.println("Ticket booked successfully!");
    }

    void display() {
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket t = new MovieTicket();

        t.get();
        t.display();
    }
}
