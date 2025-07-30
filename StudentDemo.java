class Student{
	int rollNumber;
	String name;
	int m1,m2,m3;
	float avg;
	
	Student(int rollNumber,String name,int m1,int m2,int m3){
		this.rollNumber = rollNumber;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	public void calculateAverage() {
		avg = (m1+m2+m3) / 3;
	}
	public void displayDetails() {
		System.out.println("Roll Number:"+rollNumber);
		System.out.println("Name:"+name);
		System.out.println("Mark1:"+m1+"\t Mark2:"+m2+"\tMark3:"+m3);
		System.out.println("Average Marks:"+avg);
	}
}
public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student(1,"Jack",56,45,87);
		s1.calculateAverage();
		s1.displayDetails();
		Student s2 = new Student(2,"Dan",48,78,66);
		s2.calculateAverage();
		s2.displayDetails();

	}

}
