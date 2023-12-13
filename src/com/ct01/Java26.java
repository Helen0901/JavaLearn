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
package com.ct01;
import java.util.Scanner;
public class Java26 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long factorial = 1;

        for (int i = n; i > 0; i--) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}
