/**
 * 問題
与えられた二つの整数 a と b の和、差、積、商（整数除算）、余りを計算するJavaプログラムを作成してください。

入力
二つの整数 a と b 。

出力
以下の形式で a と b の和、差、積、商、余りを出力してください。
 */
package com.ct01;
import java.util.Scanner;
public class Java5 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int a = scanner.nextInt();
	        int b = scanner.nextInt();

	        System.out.println("和: " + (a + b));
	        System.out.println("差: " + (a - b));
	        System.out.println("積: " + (a * b));
	        System.out.println("商: " + (a / b));
	        System.out.println("余り: " + (a % b));
	    }

}
