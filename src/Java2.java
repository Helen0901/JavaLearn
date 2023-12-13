import java.util.Scanner;

public class Java2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + "" + b);
		Scanner scanner2 = new Scanner(System.in);
		int number3 = scanner2.nextInt();
		if (number3 % 2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}
	}

}
