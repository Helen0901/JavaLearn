/**
 * 問題

キーボードから入力された一連の整数の中で、0が入力されたら入力を停止し、
それまでに入力された数の中で最大値と最小値を求めて出力するプログラムを書いてください。

入力

整数（0で終了）。

出力

最大値と最小値
 */
// パッケージの宣言
package com.ct01;

// Scanner クラスのインポート
import java.util.Scanner;

// Java24 クラスの宣言
public class Java24 {
    // メインメソッド
    public static void main(String[] args) {
        // ユーザー入力を受け取るための Scanner オブジェクトの作成
        Scanner scanner = new Scanner(System.in);
        
        // 最大値と最小値の初期化
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // 無限ループ
        while (true) {
            // ユーザーから整数を入力
            int number = scanner.nextInt();
            
            // 入力が 0 の場合、ループを抜ける
            if (number == 0) {
                break;
            }
            
            // 入力が現在の最大値より大きい場合、最大値を更新
            if (number > max) {
                max = number;
            }
            
            // 入力が現在の最小値より小さい場合、最小値を更新
            if (number < min) {
                min = number;
            }
        }

        // 最大値と最小値を出力
        System.out.println("最大値: " + max + " 最小値: " + min);
    }
}
