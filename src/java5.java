import java.util.Scanner;

public class java5{
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String grade = scanner.nextLine();
		
		switch (grade) {
		case"A":
			System.out.println("優");
			break;
		case "B":
			System.out.println("良");
			break;
		case "C":
			System.out.println("合格");
			break;
		case"D":
			System.out.println("不合格");
			break;
		default:
			System.out.println("**-**");
		}
	}
}
			
		

