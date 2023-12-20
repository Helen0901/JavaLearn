/**
 * 問題

Javaでプログラムを書いて、ユーザーが入力した非負整数nの階乗を計算してください。
階乗とは、1からその数までの全ての整数の積のことを指します。
例えば、5の階乗は1 * 2 * 3 * 4 * 5 = 120です。この問題では、forループとi--を使って階乗を計算する必要があります。
入力
ユーザーから入力される非負整数n。
出力
入力された数nの階乗
 */
//com.ct 01パッケージ内のJava 26というクラスを定義する
package com.ct01;
//JavaのScannerクラスをインポートする
import java.util.Scanner;
//主クラス
public class Java26 {
	//コンソールから入力を読み込むためのScannerオブジェクトの作成
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ユーザー入力の整数を読み込み、階乗を計算する
        int n = scanner.nextInt();
        //初期化階乗結果は1です
        long factorial = 1;

        //循環計算階乗
        for (int i = n; i > 0; i--) {
        	//現在の循環変数iを乗算し、階乗結果を更新する
            factorial *= i;
        }

        //最終的な階乗結果を出力
        System.out.println(factorial);
    }
}
