import java.util.Scanner;
public class OddOrEven {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		if(number%2==0) {
			System.out.println("Even Number");
		}
		else if(number%2==1) {
			System.out.println("Odd Number");
			
		}
		else {
			System.out.println("Invalid Entry");
		}
	}
}
