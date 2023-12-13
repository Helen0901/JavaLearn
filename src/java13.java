import java.util.Scanner;

public class java13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            if (number % 2 == 0) {
                sum += number;
            }
        }

        System.out.println(sum);
    }
}
