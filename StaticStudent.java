class Stdent {
    String StdName;
    static int StudentCount = 0;

    Stdent(String StdName) {
        this.StdName = StdName;
        StudentCount++;
    }

    static int getStudentCount() {
        return StudentCount;
    }
}

public class StaticStudent {
    public static void main(String[] args) {
        Stdent s1 = new Stdent("John");
        Stdent s2 = new Stdent("Jack");
        Stdent s3 = new Stdent("Joe");
        Stdent s4 = new Stdent("Sebin");
        System.out.println("Number of students created: " + Stdent.getStudentCount());
    }
}
