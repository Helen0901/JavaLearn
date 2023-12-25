/**
 * 問題

100以下の二つの正整数に対して、その最小公倍数を計算し、結果を出力するプログラムを作成してください。

入力

二つのint型変数（プログラム内で直接定義）。

出力

二つの数の最小公倍数。
 */
// パッケージの宣言
package com.ct01;

// Java20 クラスの宣言
public class Java20 {
    // メインメソッド
    public static void main(String[] args) {
        // 変数の初期化
        int a = 15;
        int b = 20;
        // 元の変数の値を保存
        int originalA = a;
        int originalB = b;
        
        // ユークリッドの互除法を使って最大公約数を計算
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        // 最小公倍数を計算
        int lcm = (originalA * originalB) / a;
        
        // 結果を出力
        System.out.println(lcm);
    }
}
