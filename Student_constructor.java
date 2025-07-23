import java.util.Scanner;

public class Student_constructor {
    String name;
    int age;

    public void getStudentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
    }

    public void printStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student_constructor S1 = new Student_constructor();
        S1.getStudentDetails();
        S1.printStudentDetails();
    }
}
