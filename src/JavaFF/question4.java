/**以下メソッドの実施結果を教えてください
 * public class Kicker {
 private static void fillArray(String[] array) {
 array[0] = "value2";
 }
 public static void main(String args[]) {
 String[] array = new String[]{"value1"};
 fillArray(array);
 System.out.println(array[0]);
 }
}
 */
package JavaFF;

public class question4 {
	public class Kicker {
		 private static void fillArray(String[] array) {
		 array[0] = "value2";
		 }
		 public static void main(String args[]) {
		 String[] array = new String[]{"value1"};
		 fillArray(array);
		 System.out.println(array[0]);
		 }
		}
	//メソッドの実施結果はvalue2です

}
