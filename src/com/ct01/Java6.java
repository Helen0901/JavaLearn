/**
 * 問題

浮動小数点数型の変数dがあります。この変数dを四捨五入して整数型の変数iに変換し、変換後のiを出力するJavaプログラムを書いてください。

入力

がランダムに入力した浮動小数点数。

出力

 四捨五入後の整数（小数点以下第一位が5以上の場合は切り上げ、それ以外の場合は切り捨てる）。
 */
// パッケージ宣言: com.ct01 パッケージに所属する
package com.ct01;

// java.util パッケージから Scanner クラスをインポートする
import java.util.Scanner;

// Java6 クラスの定義
public class Java6 {
    // main メソッドの定義
    public static void main(String[] args) {
        // Scanner クラスのインスタンスを作成し、キーボードからの入力を受け付ける
        Scanner sc = new Scanner(System.in);

        // double 型の変数 d に、キーボードからの次の double 型の入力を格納
        double d = sc.nextDouble();

        // double 型の変数 d を四捨五入して int 型の変数 i に代入
        int i = (int)Math.round(d);

        // i の値を出力
        System.out.println(i);
    }
}
