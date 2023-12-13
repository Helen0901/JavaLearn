/**
 * 問題

数列9、99、999...9999999999の和を計算するJavaプログラムを書いてください。
この数列は各項が前の項に10を掛けて9を加えることで生成されます。
ループを使用してこの数列を生成し、同時に和を求めてください。

入力

この問題では入力は必要ありません。

出力

計算された数列の和。
 */
package com.ct01;

public class Java18 {
	public static void main(String[] args) {
        long sum = 0;
        long number = 9;

        for (int i = 1; i <= 10; i++) {
            sum += number;
            number = number * 10 + 9;
        }

        System.out.println(sum);
    }
}
