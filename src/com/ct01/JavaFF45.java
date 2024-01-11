/**
 * 問題:

与えられた文字列がパリンドローム（前後から読んでも同じになる文字列）
であるかどうかを判定するメソッドisPalindromeを作成してください。

入力:
文字列（例: "racecar"）

出力:
パリンドロームかどうかの真偽値（例: true）
 */
package com.ct01;

public class JavaFF45 {
	public static void main(String[] ags) {
		System.out.println(isPalindrome("racvvecar"));
	}

	public static boolean isPalindrome(String str) {

		boolean res = false;
		for (int i = 0; i < str.length() - 1; i++) {

			if (i == 0) {
				continue;
			}
			if (str.charAt(i - 1) != str.charAt(i + 1)) {
				continue;
			}
			res = true;
		}
		return res;
	}

}
