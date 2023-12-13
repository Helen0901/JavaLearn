import java.util.Scanner;

public class Java1{
	public static void main(String[] args) {
		int number = 10;
		System.out.println(number);
		String hello = "こんにちは";
        String world = "世界";
        System.out.println(hello + world);	
		double number1 = 12.34;
				int convertednumber1 = (int)number1;
				System.out.println("入力: "+number1+ " 出力: "+convertednumber1);
				double number2 = 1.88;
				int convertednumber2 = (int)number2;
				System.out.println(convertednumber2);
				int x = 5;
				int y = 10;
				int sum = x+y;
				System.out.println("合計: "+sum);
				int a = 15;
				int b= 4;
				int he =a+b;
				int cha = a-b;
				int ji = a*b;
				int shang = a/b;
				int yu = a%b;
				System.out.println("和:"+he+"差:"+cha+"积:"+ji+"商:"+shang+"余:"+yu);
				Scanner scanner = new Scanner(System.in);
				double d = scanner.nextDouble();
				int i = (int)Math.round(d);
				System.out.println(i);
				Scanner scanner1 = new Scanner(System.in);
				int e = scanner1.nextInt();
				int f= scanner1.nextInt();
				e=e+f;
				f=e-f;
				e=e-f;
				System.out.println(e+""+f);
				
	}

				
				
				
				
				
				
				
				
				
				
				
	}
