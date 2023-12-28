/**
 * 問題
与えられた二つの整数 a と b の和、差、積、商（整数除算）、余りを計算するJavaプログラムを作成してください。

入力
二つの整数 a と b 。

出力
以下の形式で a と b の和、差、積、商、余りを出力してください。
 */
// パッケージ宣言: com.ct01 パッケージに所属する
package com.ct01;

// java.util パッケージから Scanner クラスをインポートする
import java.util.Scanner;

// Java5 クラスの定義
public class Java5 {
    // main メソッドの定義
    public static void main(String[] args) {
        // Scanner クラスのインスタンスを作成し、キーボードからの入力を受け付ける
        Scanner scanner = new Scanner(System.in);

        // キーボードからの次の整数型の入力を変数 a に格納
        int a = scanner.nextInt();

        // キーボードからの次の整数型の入力を変数 b に格納
        int b = scanner.nextInt();

        // 変数 a と b の和を出力
        System.out.println("和: " + (a + b));

        // 変数 a と b の差を出力
        System.out.println("差: " + (a - b));

        // 変数 a と b の積を出力
        System.out.println("積: " + (a * b));

        // 変数 a と b の商を出力
        System.out.println("商: " + (a / b));

        // 変数 a と b の余りを出力
        System.out.println("余り: " + (a % b));
    }
}
