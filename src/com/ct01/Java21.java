/**
 * 問題

キーボードから任意の数の10000以下の正整数を入力し、負の数が入力されたときに入力を終了し、それまでに入力された正整数の平均値を計算して出力するプログラムを書いてください。平均値はdouble型で計算し、小数点以下2桁で出力します。

入力

任意の数の正整数（負の数で終了）。

出力

入力された正整数の平均値（小数点以下2桁で出力）。
 */
package com.ct01;
import java.util.Scanner;
public class Java21 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
            count++;
        }

        double average = (double)sum / count;
        System.out.printf("%.2f", average);
    }
}
