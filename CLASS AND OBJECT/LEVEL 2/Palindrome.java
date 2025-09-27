import java.util.Scanner;

public class Palindrome{
    String text;
    boolean isPalindrome;

    void reverse() {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        isPalindrome = text.equalsIgnoreCase(reversed);
    }

    void display() {
        if (isPalindrome) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindrome p = new Palindrome();

        System.out.print("Enter text: ");
        p.text = sc.nextLine();

        p.reverse();
        p.display();
    }
}
