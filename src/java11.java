import java.util.Scanner;
public class java11 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		for(;;) {
			int number = scanner.nextInt();
			if(number<0) {
				break;
			}
			sum+=number;
			count++;
		}
		double average = count>0?(double)sum/count:0;
       System.out.printf("%.2f", average);
	}

}
