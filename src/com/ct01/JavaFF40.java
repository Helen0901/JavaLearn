/**
 * 問題:
与えられた整数が素数（1とその数自身以外に正の約数を持たない数）かどうかを判定する
メソッドisPrimeを作成してください。

入力:
整数（例: 29）

出力:
素数かどうかの真偽値（例: true）
 */
package com.ct01;

public class JavaFF40 {
	public static void main(String[]args) {
		System.out.println(isPrime(2));
	}
	public static boolean isPrime(int number) {
		if (number<=1) {
			return false;
		}
		for(int i = 2; i<=Math.sqrt(number); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
