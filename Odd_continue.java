public class Odd_continue {
	public static void main(String[] args) {
		for(int i=1;i<50;i++) {
			if(i %2==0) {
				continue;
			}
			else {
				System.out.print(i +" ");
			}
		}
	}

}
