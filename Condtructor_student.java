public class Student{
    String name;
    int rollNumber;
    String department;
    public Student(String S1name, int S1rollNumber, String S1department) {
        name = S1name;
        rollNumber = S1rollNumber;
        department = S1department;
    }

    public static void main(String[] args) {
        Student newStudent = new Student("Jack", 42,"CSE");
        System.out.println("Name: " + newStudent.name);
        System.out.println("Color: " + newStudent.rollNumber);
        System.out.println("Year: " +newStudent.department);
    }
}
