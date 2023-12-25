/**
 * 問題

与えられた整数が素数であるかどうかを判断するプログラムを書いてください。
素数は1より大きく、1とその数自身以外には約数を持たない正の整数です。

入力

1より大きい整数。

出力

入力された整数が素数の場合はtrue、そうでない場合はfalseを出力します。
 */
// パッケージの宣言
package com.ct01;

// Scanner クラスのインポート
import java.util.Scanner;

// Java22 クラスの宣言
public class Java22 {
    // メインメソッド
    public static void main(String[] args) {
        // ユーザー入力を受け取るための Scanner オブジェクトの作成
        Scanner scanner = new Scanner(System.in);
        
        // ユーザーから整数を入力
        int number = scanner.nextInt();
        
        // 素数かどうかを判定するためのフラグ
        boolean isPrime = true;

        // 入力が1以下の場合、素数でないと判断
        if (number <= 1) {
            isPrime = false;
        } else {
            // 2からルートを取った整数までの範囲で割り算を行い、割り切れた場合は素数でないと判断
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    // 素数でないことが分かったらループを抜ける
                    break;
                }
            }
        }

        // 結果を出力
        System.out.println(isPrime);
    }
}
