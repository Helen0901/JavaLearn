/**
 * 問題:
与えられた文字列の中で特定の文字が何回出現するかを数えるメソッドcountCharacterを作成してください。

入力:
文字列と文字（例: "hello world", 'l'）

出力:
文字の出現回数（例: 3）
 */
package com.ct01;

public class JavaFF46 {
	public static void main(String[]args) {
		System.out.println(countCharacter("hello world", 'l'));
	}
	public static int countCharacter(String str,char ch) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==ch) {
				count++;
			}
		}
		return count;
	}
	
}
