import java.util.Scanner;

public class Student {
    String name;
    int rollNumber;
    double marks;
    String grade;

    void calculateGrade() {
        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 75) {
            grade = "B";
        } else if (marks >= 50) {
            grade = "C";
        } else {
            grade = "D";
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter name: ");
        s.name = sc.next();

        System.out.print("Enter roll number: ");
        s.rollNumber = sc.nextInt();

        System.out.print("Enter marks: ");
        s.marks = sc.nextDouble();

        s.calculateGrade();
        s.display();
    }
}
