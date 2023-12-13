/**
 * 問題
整数型の変数が与えられた場合、その数が奇数か偶数かを判定するJavaプログラムを書いてください。
入力
整数型の値。
出力
与えられた数が奇数なら奇数、偶数なら偶数と出力します。
 */
package com.ct01;
import java.util.Scanner;
public class Java11{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
}
