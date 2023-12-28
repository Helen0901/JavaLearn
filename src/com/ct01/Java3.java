/**
 * 問題

double 型の変数を int 型に変換するプログラムを作成してください。変換時には小数点以下を切り捨てます。

入力

ランダムな double 型の変数

出力

変換後の int 型の変数
 */
// パッケージ宣言: com.ct01 パッケージに所属する
package com.ct01;

// Java3 クラスの定義
public class Java3 {
    // main メソッドの定義
    public static void main(String[] args) {
        // double 型変数 number1 に値 12.34 を代入
        double number1 = 12.34;

        // double 型変数 number1 を int 型に変換し、その結果を convertedNumber1 に代入
        int convertedNumber1 = (int) number1;

        // 入力された number1 と変換後の convertedNumber1 の値を出力
        System.out.println("入力: " + number1 + " 出力: " + convertedNumber1);

        // double 型変数 number2 に値 1.88 を代入
        double number2 = 1.88;

        // double 型変数 number2 を int 型に変換し、その結果を convertedNumber2 に代入
        int convertedNumber2 = (int) number2;

        // 入力された number2 と変換後の convertedNumber2 の値を出力
        System.out.println("入力: " + number2 + " 出力: " + convertedNumber2);
    }
}


