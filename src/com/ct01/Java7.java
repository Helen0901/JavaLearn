/**
 * 問題

第三の変数を使用せずに、2つのint型変数の値を交換するJavaプログラムを書いてください。

入力

変数aとbの値。

出力

 交換後の変数aとbの値。値の間には空白を入れてください。
 */
// パッケージの宣言
package com.ct01;

// Scanner クラスを使用するためのインポート文
import java.util.Scanner;

// Java7 クラスの宣言
public class Java7 {
	
	// メインメソッドの宣言
    public static void main(String[] args) {
    	
    	// Scanner オブジェクトの生成
        Scanner scanner = new Scanner(System.in);
        
        // 2つの整数を受け取る変数の宣言と初期化
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // a と b の値を交換する
        a = a + b;
        b = a - b;
        a = a - b;

        // 交換後の a と b の値を出力
        System.out.println(a + " " + b);
    }
}
