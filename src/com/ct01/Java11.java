/**
 * 問題
整数型の変数が与えられた場合、その数が奇数か偶数かを判定するJavaプログラムを書いてください。
入力
整数型の値。
出力
与えられた数が奇数なら奇数、偶数なら偶数と出力します。
 */
// パッケージの宣言
package com.ct01;

// Scanner クラスを使用するためのインポート文
import java.util.Scanner;

// Java11 クラスの宣言
public class Java11 {
    
    // メインメソッドの宣言
    public static void main(String[] args) {
        
        // Scanner オブジェクトの生成
        Scanner scanner = new Scanner(System.in);
        
        // 整数を受け取る変数の宣言と初期化
        int number = scanner.nextInt();
        
        // 偶数か奇数かの条件判定
        if (number % 2 == 0) {
            System.out.println("偶数"); // 偶数の場合、「偶数」と出力
        } else {
            System.out.println("奇数"); // 奇数の場合、「奇数」と出力
        }
    }
}
