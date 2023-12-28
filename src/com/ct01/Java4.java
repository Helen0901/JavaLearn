/**
 * 問題
整数型の変数 x と y を宣言し、それらの変数に値を代入して、それらの合計を計算して出力するJavaプログラムを書いてください。

入力
二つの整数 x と y（例：x = 5, y = 10）。

出力
x と y の合計を出力してください。
 */
// パッケージ宣言: com.ct01 パッケージに所属する
package com.ct01;

// Java4 クラスの定義
public class Java4 {
    // main メソッドの定義
    public static void main(String[] args) {
        // 整数型変数 x に値 5 を代入
        int x = 5;

        // 整数型変数 y に値 10 を代入
        int y = 10;

        // 変数 x と y の和を計算し、その結果を変数 sum に代入
        int sum = x + y;

        // 変数 sum の値を出力
        System.out.println("合計: " + sum);
    }
}

