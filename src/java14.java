import java.util.Scanner;
public class java14 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    while(true) {
	    	int number = scanner.nextInt();
	    	if (number ==0) {
	    		break;
	    	}
	    	if(number>max) {
	    		max = number;
	    	}
	    	if(number<min) {
	    		min = number;
	    	}
	    }
	    System.out.println("最大値"+max+"最小値"+min);
	}

}
