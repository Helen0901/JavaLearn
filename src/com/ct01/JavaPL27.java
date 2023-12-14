/**
 * 問題
キーボードから6つの整数を入力し、それらを配列に格納した後、
まず配列を正順で出力し、次に配列を逆順にして出力するプログラムを書いてください。
入力
ランダムに入力された6つの整数。
出力
最初に配列の正順での出力、次に配列を逆順にして出力（Arrays.toStringメソッドを使用）。
 */
package com.ct01;
import java.util.Arrays;
import java.util.Scanner;
public class JavaPL27 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int[]numbers = new int[6];
		for(int i = 0;i < 6;i++) {
			numbers[i] = scanner.nextInt();
		}
		System.out.println("正順:" + Arrays.toString(numbers));
		for(int i = 0; i < numbers.length/2; i++) {
			int temp = numbers[i];
			numbers[i] = numbers[numbers.length - 1-i];
			numbers[numbers.length - 1 -i ] = temp;
		}
		System.out.println("逆順:" + Arrays.toString(numbers));
	}
}
