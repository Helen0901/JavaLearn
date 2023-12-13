import java.util.Scanner;

public class java7 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		if(month>=3&&month<=5) {
			System.out.println("春");
    	}else if (month>=6&&month<=8){
    		System.out.println("夏");
    	}else if (month>=9&&month<=11) {
    		System.out.println("秋");
    	}else {
    		System.out.println("冬");
    	}
		
		
	}

}
