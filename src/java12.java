import java.util.Scanner;
public class java12 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		boolean isprime = true;
		if (number<=1) {
			isprime = false;
		 }else {
			 for (int i =2; i<=Math.sqrt(number);i++) {
				 if(number % i ==0) {
					 isprime = false;
					 break;
				 }
			 }
		 }
		System.out.println(isprime);
	}
	

}
