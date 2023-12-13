/**
 * 問題

100以下の二つの正整数に対して、その最小公倍数を計算し、結果を出力するプログラムを作成してください。

入力

二つのint型変数（プログラム内で直接定義）。

出力

二つの数の最小公倍数。
 */
package com.ct01;

public class Java20 {
	public static void main(String[] args) {
        int a = 15;
        int b = 20;
        int originalA = a;
        int originalB = b;
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

       
        int lcm = (originalA * originalB) / a;
        System.out.println(lcm);
    }
}
