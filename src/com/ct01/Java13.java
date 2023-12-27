/**
 * 問題

ユーザーが入力した年齢に基づいて人を分類するプログラムを書いてください。分類は以下の通りです：0～12歳は「子供」、13～19歳は「青少年」、20～59歳は「成人」、60歳以上は「高齢者」とします。

入力

ーザーの年齢（整数）。

出力

年齢に基づく分類。
 */
// パッケージの宣言
package com.ct01;

// Scanner クラスを使用するためのインポート文
import java.util.Scanner;

// Java13 クラスの宣言
public class Java13 {
	
	// メインメソッドの宣言
    public static void main(String[] args) {
    	
    	// Scanner オブジェクトの生成
        Scanner scanner = new Scanner(System.in);
        
        // 年齢を受け取る変数の宣言と初期化
        int age = scanner.nextInt();
        
        // 年齢による条件分岐
        if (age <= 12) {
            System.out.println("子供"); // 12歳以下の場合、「子供」と出力
        } else if (age <= 19) {
            System.out.println("青少年"); // 13歳以上19歳以下の場合、「青少年」と出力
        } else if (age <= 59) {
            System.out.println("成人"); // 20歳以上59歳以下の場合、「成人」と出力
        } else {
            System.out.println("高齢者"); // 60歳以上の場合、「高齢者」と出力
        }
    }
}
