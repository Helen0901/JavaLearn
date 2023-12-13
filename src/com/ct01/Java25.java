/**
 * 問題

キーボードから入力された整数の桁数を計算して出力するプログラムを書いてください。
入力された整数が0以下の場合は、その数自体を出力します。

入力

一つの整数。

出力

入力された整数の桁数、または0以下の場合は入力された整数そのもの。
 */
package com.ct01;
import java.util.Scanner;
public class Java25 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println(number);
        } else {
            int digits = 0;
            for (; number > 0; number /= 10) {
                digits++;
            }
            System.out.println(digits);
        }
    }
}
