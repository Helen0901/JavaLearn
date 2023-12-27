/**
 * 問題

LCスーパーでプロモーション活動が行われています。購入金額に応じて割引が適用され、さらに購入金額の小数点以下の部分は切り捨てられます。
購入金額による割引は次の通りです：100円以上で10％オフ、500円以上で20％オフ、2000円以上で30％オフ、5000円以上で40％オフ。
鈴木さんは自分が支払うべき金額を計算できません。プログラムを作成して、彼女が支払うべき金額を計算してください。

入力

鈴木さんの購入金額（int型）。

出力

割引後の支払い金額（int型）。
 */
// パッケージの宣言
package com.ct01;

// Scanner クラスを使用するためのインポート文
import java.util.Scanner;

// Java12 クラスの宣言
public class Java12 {
    
    // メインメソッドの宣言
    public static void main(String[] args) {
        
        // Scanner オブジェクトの生成
        Scanner scanner = new Scanner(System.in);
        
        // 金額を受け取る変数の宣言と初期化
        int amount = scanner.nextInt();
        
        // 割引率を格納する変数の宣言と初期化
        double discount = 1.0;
        
        // 金額による条件分岐
        if (amount >= 5000) {
            discount = 0.6; // 5000以上の場合、割引率を0.6に設定
        } else if (amount >= 2000) {
            discount = 0.7; // 2000以上の場合、割引率を0.7に設定
        } else if (amount >= 500) {
            discount = 0.8; // 500以上の場合、割引率を0.8に設定
        } else if (amount >= 100) {
            discount = 0.9; // 100以上の場合、割引率を0.9に設定
        }
        
        // 最終金額を計算し、整数型に変換
        int finalAmount = (int)(amount * discount);
        
        // 最終金額を出力
        System.out.println(finalAmount);
    }
}
