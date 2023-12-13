/**
 * 問題

与えられた整数が素数であるかどうかを判断するプログラムを書いてください。
素数は1より大きく、1とその数自身以外には約数を持たない正の整数です。

入力

1より大きい整数。

出力

入力された整数が素数の場合はtrue、そうでない場合はfalseを出力します。
 */
package com.ct01;
import java.util.Scanner;
public class Java22 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(isPrime);
    }
}
