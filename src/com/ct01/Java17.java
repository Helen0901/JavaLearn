/**
 * 問題

体重指数は体重（kg）を身長（m）の平方で割ったものです。
この指数に基づき、体型を判定するJavaプログラムを書いてください。
体重指数が18.5未満の場合は「やせ型」、
18.5以上20.9未満の場合は「スリム」、
20.9以上24.9以下の場合は「標準」、
24.9を超える場合は「肥満気味」と判定してください。

入力

身長（m）と体重（kg）。

出力

体重指数に基づくユーザーの体型状態。
 */
package com.ct01;
import java.util.Scanner;

public class Java17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ユーザーに身長の入力を促します
        double height = scanner.nextDouble();

        // ユーザーに体重の入力を促します
        double weight = scanner.nextDouble();

        // BMIを計算します
        double bmi = weight / (height * height);

        // BMIに基づいて健康状態を判定します
        String status;
        if (bmi < 18.5) {
            status = "やせ型";
        } else if (bmi < 20.9) {
            status = "スリム";
        } else if (bmi <= 24.9) {
            status = "標準";
        } else {
            status = "肥満気味";
        }

        // 健康状態を出力します
        System.out.println(status);
    }
}
