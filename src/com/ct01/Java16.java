/**
 * 問題

ユーザーが入力した月に基づいて、それに対応する季節を判定するJavaプログラムを書いてください。
季節の分類は以下の通りです：3～5月は「春」、6～8月は「夏」、9～11月は「秋」、12月、1月、2月は「冬」とします。

入力

月（整数、1～12）。

出力

対応する季節。
 */
package com.ct01;
import java.util.Scanner;
public class Java16 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        if (month >= 3 && month <= 5) {
            System.out.println("春");
        } else if (month >= 6 && month <= 8) {
            System.out.println("夏");
        } else if (month >= 9 && month <= 11) {
            System.out.println("秋");
        } else {
            System.out.println("冬");
        }
    }
}
