/**
 * 以下メソッドの実施結果を教えてください
 */
package JavaFF;

public class question5 {
	public class Kicker {
		 private static void fillArray(String[] array) {
		 array = new String[]{"1", "2"};
		 }
		 public static void main(String args[]) {
		 String[] array = null;
		 fillArray(array);
		 System.out.println(array == null);
		 }
		}
	//メソッドの実施結果はtrueです

}
