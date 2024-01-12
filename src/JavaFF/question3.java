/**
 * 質問３．以下メソッドの実施結果を教えてください。
public class Kicker {
 private static void sayHello(String y) {
 y = "Hello world";
 }
 public static void main(String args[]) {
 String x = null;
 sayHello(x);
 */
package JavaFF;

public class question3 {
	
	public class Kicker {
		 private static void sayHello(String y) {
		 y = "Hello world";
		 }
		 public static void main(String args[]) {
		 String x = null;
		 sayHello(x);
		 System.out.println(x);
		 }
		 
	}
	//mainメソッド内でxを出力しても結果はnullです

}

