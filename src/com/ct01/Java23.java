/**
 * 問題

キーボードから入力された一連の整数の中で、負の数が入力されたら入力を停止し、
それまでに入力された偶数の合計を計算して出力するプログラムを書いてください。

入力

整数（負の数で終了）。

出力

入力された偶数の合計。
 */
// パッケージの宣言
package com.ct01;

// Scanner クラスのインポート
import java.util.Scanner;

// Java23 クラスの宣言
public class Java23 {
    // メインメソッド
    public static void main(String[] args) {
        // ユーザー入力を受け取るための Scanner オブジェクトの作成
        Scanner scanner = new Scanner(System.in);
        
        // 合計を初期化
        int sum = 0;

        // 無限ループ
        while (true) {
            // ユーザーから整数を入力
            int number = scanner.nextInt();
            
            // 入力が負の数の場合、ループを抜ける
            if (number < 0) {
                break;
            }
            
            // 入力が偶数の場合、合計に加算
            if (number % 2 == 0) {
                sum += number;
            }
        }

        // 合計を出力
        System.out.println(sum);
    }
}
