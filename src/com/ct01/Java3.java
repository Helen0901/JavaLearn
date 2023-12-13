/**
 * 問題

double 型の変数を int 型に変換するプログラムを作成してください。変換時には小数点以下を切り捨てます。

入力

ランダムな double 型の変数

出力

変換後の int 型の変数
 */
package com.ct01;

public class Java3 {
	public static void main(String[] args) {
        double number1 = 12.34;
        int convertedNumber1 = (int) number1;
        System.out.println("入力: " + number1 + " 出力: " + convertedNumber1);

        double number2 = 1.88;
        int convertedNumber2 = (int) number2;
        System.out.println("入力: " + number2 + " 出力: " + convertedNumber2);
    }
}


