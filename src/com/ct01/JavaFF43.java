/**
 * 問題:
与えられた基数と指数から累乗を計算するメソッドpowerを作成してください。

入力:
基数と指数（例: 2, 3）

出力:
累乗の結果（例: 8）
 */
package com.ct01;

public class JavaFF43 {
	public static void main(String[]args) {
		
		System.out.println(power(2,3));
	}
	
	public static  int power(int num1,int num2) {
		int result = 1;
		for(int i = 0; i<num2; i++) {
			result =  result * num1;
		}
		return result;
	}

}
