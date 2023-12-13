/**
 * 問題

第三の変数を使用せずに、2つのint型変数の値を交換するJavaプログラムを書いてください。

入力

変数aとbの値。

出力

 交換後の変数aとbの値。値の間には空白を入れてください。
 */
package com.ct01;
import java.util.Scanner;
public class Java7 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);
    }
}
