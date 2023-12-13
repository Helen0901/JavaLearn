import java.util.Scanner;

public class java3 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		double discount = 1.0;
		if (amount >=5000){
			discount = 0.6;
		}else if (amount>=2000) {
			discount = 0.7;
		}else if (amount>=500) {
			discount = 0.8;
		}else if (amount>=100) {
			discount = 0.9;
		}
		int finalamount = (int)(amount*discount);
		System.out.println(finalamount);
		
	}

}
