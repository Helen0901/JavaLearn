/**
 * 問題

コンソールから整数を入力してもらい、ユーザーが非正数（0または負の数）を入力した時点で入力を停止します。
このプログラムはユーザーが入力した正の整数の個数をカウントし、その数を出力してください。
入力される数の数は2147483647を超えないと仮定します。

入力

空白で区切られた複数の整数。

出力

入力された正の整数の個数。
 */
package com.ct01;
import java.util.Scanner;

public class Java19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        // ユーザーからの入力を無限ループで受け付けます
        while (true) {
            // 整数の入力をユーザーに要求します
            int number = scanner.nextInt();

            // 入力された数が0以下の場合、ループを抜けます
            if (number <= 0) {
                break;
            }

            // 入力された数が0より大きい場合、カウントを増やします
            count++;
        }

        // 入力された正の整数の個数を出力します
        System.out.println(count);
    }
}
