/**
 * 問題


キーボードから入力された整数の桁数を計算して出力するプログラムを書いてください。
入力された整数が0以下の場合は、その数自体を出力します。

入力

一つの整数。

出力

入力された整数の桁数、または0以下の場合は入力された整数そのもの。
 */
// パッケージの宣言
package com.ct01;

// Scanner クラスのインポート
import java.util.Scanner;

// Java25 クラスの宣言
public class Java25 {
    // メインメソッド
    public static void main(String[] args) {
        // ユーザー入力を受け取るための Scanner オブジェクトの作成
        Scanner scanner = new Scanner(System.in);
        
        // 整数をユーザー入力から読み取る
        int number = scanner.nextInt();

        // 入力された数字が 0 以下かどうかを判断
        if (number <= 0) {
            // もし 0 以下なら、そのままその数字を出力
            System.out.println(number);
        } else {
            // 0 より大きい場合、数字の桁数を計算する
            int digits = 0;
            // 数字が 0 になるまで 10 で割り続けるループ
            for (; number > 0; number /= 10) {
                // 各ループで桁数を増やす
                digits++;
            }
            // 計算された桁数を出力
            System.out.println(digits);
        }
    }
}
