
public class Java10 {
	public static void main(String[]args) {
		int a = 15;
		int b = 20;
		int originalA = a;
		int originalB  = b;
		//最大公約数を求める
		while (b!=0) {
			int temp = b;
			b = a%b;
			a = temp;
			}
		int lcm = (originalA* originalB)/a;
		System.out.println(lcm);
	}

}
