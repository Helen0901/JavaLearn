/**
 * 問題

コンソールから整数を入力してもらい、ユーザーが非正数（0または負の数）を入力した時点で入力を停止します。
このプログラムはユーザーが入力した正の整数の個数をカウントし、その数を出力してください。
入力される数の数は2147483647を超えないと仮定します。

入力

空白で区切られた複数の整数。

出力

入力された正の整数の個数。
 */
package com.ct01;
import java.util.Scanner;
public class Java19 {
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
