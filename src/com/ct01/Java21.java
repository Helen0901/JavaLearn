/**
 * 問題


キーボードから任意の数の10000以下の正整数を入力し、負の数が入力されたときに入力を終了し、それまでに入力された正整数の平均値を計算して出力するプログラムを書いてください。
平均値はdouble型で計算し、小数点以下2桁で出力します。

入力

任意の数の正整数（負の数で終了）。

出力

入力された正整数の平均値（小数点以下2桁で出力）。
 */
// パッケージの宣言
package com.ct01;

// Scanner クラスのインポート
import java.util.Scanner;

// Java21 クラスの宣言
public class Java21 {
    // メインメソッド
    public static void main(String[] args) {
        // ユーザー入力を受け取るための Scanner オブジェクトの作成
        Scanner scanner = new Scanner(System.in);
        
        // 合計を初期化
        int sum = 0;
        // 数をカウントする変数を初期化
        int count = 0;

        // 無限ループ
        while (true) {
            // ユーザーから整数を入力
            int number = scanner.nextInt();
            
            // 入力が負の数の場合、ループを抜ける
            if (number < 0) {
                break;
            }
            
            // 合計に入力された数を加算
            sum += number;
            // カウントをインクリメント
            count++;
        }

        // 平均を計算（注意：countが0の場合、ゼロ除算エラーが発生する可能性がある）
        double average = (double) sum / count;

        // 平均を小数点2桁で出力
        System.out.printf("%.2f", average);
    }
}
