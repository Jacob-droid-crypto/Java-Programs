import java.util.Scanner;
public class Grade {
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the marks:");
		 int marks = sc.nextInt();
		if(marks>=90) {
			System.out.print("Grade A");
		}
		else if(marks <90 && marks >=75) {
			System.out.print("Grade B");
	    }
		else if(marks<75 && marks>=60) {
			System.out.print("Grade C");
		}
		else if(marks<60 && marks>=40) {
			System.out.print("Grade D");
		}
		else {
			System.out.print("Fail");
		}
	}

}
