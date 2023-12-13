import java.util.Scanner;

public class java8 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		double height = scanner.nextDouble();
		double weight = scanner.nextDouble();
		double bmi = weight  /  (height*height);
		String status;
		if (bmi<18.5) {
			status = "やせ型";
		}else if (bmi<20.9) {
			status = "スリム";
		}else if (bmi<=24.9) {
			status = "標準";
		}else {
			status = "肥満気味";
		}
		System.out.println(status);
	}
}
