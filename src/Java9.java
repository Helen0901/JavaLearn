import java.util.Scanner;

public class Java9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            int number = scanner.nextInt();
            if (number <= 0) {
                break;
            }
            count++;
        }

        System.out.println(count);
    }
}
