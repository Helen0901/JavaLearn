import java.util.Scanner;
public class java16 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
        long factorial = 1;
	    for (int i = n;  i>0; i--) {
		factorial*=i;
	}
	   System.out.println(factorial);
	}
}
