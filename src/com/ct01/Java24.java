/**
 * 問題

キーボードから入力された一連の整数の中で、0が入力されたら入力を停止し、
それまでに入力された数の中で最大値と最小値を求めて出力するプログラムを書いてください。

入力

整数（0で終了）。

出力

最大値と最小値
 */
package com.ct01;
import java.util.Scanner;
public class Java24 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println("最大値: " + max + " 最小値: " + min);
    }
}
