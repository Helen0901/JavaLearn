/**
 * 問題

キーボードから6つの整数を入力し、それらを配列に格納した後、
まず配列を正順で出力し、次に配列を逆順にして出力するプログラムを書いてください。
入力
ランダムに入力された6つの整数。
出力
最初に配列の正順での出力、次に配列を逆順にして出力（Arrays.toStringメソッドを使用）。
 */
//com.ct 01パッケージ内のJavaPL 27というクラスを定義する
package com.ct01;
//JavaのArraysクラスとScannerクラスをインポートする
import java.util.Arrays;
import java.util.Scanner;
public class JavaPL27 {
	public static void main(String[]args) {
		//コンソールから入力を読み込むためのScannerオブジェクトの作成
		Scanner scanner = new Scanner(System.in);
		//6つの要素を含む整数配列numbersを定義する
		int[]numbers = new int[6];
		//ユーザーが入力した6つの整数を循環的に読み取り、配列に格納
		for(int i = 0;i < 6;i++) {
			numbers[i] = scanner.nextInt();
		}
		//順序付け配列の配列内容を出力
		System.out.println("正順:" + Arrays.toString(numbers));
		//配列要素の逆配列を循環的に実現する
		for(int i = 0; i < numbers.length/2; i++) {
			//一時変数tempを使用した配列要素の交換
			int temp = numbers[i];
			numbers[i] = numbers[numbers.length - 1-i];
			numbers[numbers.length - 1 -i ] = temp;
		}
		//逆配列配列配列の配列内容を出力
		System.out.println("逆順:" + Arrays.toString(numbers));
	}
}
