import java.util.Scanner;

public class java4 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if (age<=12) {
			System.out.println("子供");
		}else if(age<=19) {
			System.out.println("青少年");
		}else if(age<=59) {
			System.out.println("成人");
		}else {
			System.out.println("高齢者");
		}
		}

}
