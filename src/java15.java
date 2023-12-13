import java.util.Scanner;
public class java15 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		 if (number <= 0) {
	            System.out.println(number);
	        } else {
	            int digits = 0;
	            for (; number > 0; number /= 10) {
	                digits++;
	            }
	            System.out.println(digits);
	        }
	}

}
