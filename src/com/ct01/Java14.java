/**
 * 問題

成績等級にはA、B、C、Dの4つがあり、それぞれ「優」、「良」、「合格」、「不合格」を意味します。ユーザーが成績等級に対応するを入力した場合、それに応じた評価を出力するプログラムを書いてください。入力が誤っている場合は「**_**」を出力してください。

入力

成績等級

出力

「優」、「良」、「合格」、「不合格」、または「**_**」。
 */
// パッケージの宣言
package com.ct01;

// Scanner クラスを使用するためのインポート文
import java.util.Scanner;

// Java14 クラスの宣言
public class Java14 {
    
    // メインメソッドの宣言
    public static void main(String[] args) {
        
        // Scanner オブジェクトの生成
        Scanner scanner = new Scanner(System.in);
        
        // ユーザーからの入力を受け取る変数の宣言と初期化
        String grade = scanner.nextLine();
        
        // switch 文による等級判定
        switch (grade) {
            case "A":
                System.out.println("優"); // Aの場合、「優」と出力
                break;
            case "B":
                System.out.println("良"); // Bの場合、「良」と出力
                break;
            case "C":
                System.out.println("合格"); // Cの場合、「合格」と出力
                break;
            case "D":
                System.out.println("不合格"); // Dの場合、「不合格」と出力
                break;
            default:
                System.out.println("**_**"); // それ以外の場合、「**_**」と出力
        }
    }
}
