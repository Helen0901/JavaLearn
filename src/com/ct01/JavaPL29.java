/**
 * 問題

整数の二次元配列が与えられた場合に、その配列の対角線上にある要素の合計を計算し、出力してください。
ここで対角線とは、配列の左上から右下にかけての要素を指します。
二次元配列はハードコーディングされているものとします。

入力
特に入力はありません。
二次元配列はコード内に直接定義されています。

出力
対角線上の要素の合計値を出力してください
 */
package com.ct01;
public class JavaPL29 {
	public static void main (String[]args) {
		//定義一個名爲array的二維數組，其中包含了3*3的矩形
		int[][] array= {{1,2,3},{4,5,6},{7,8,9}};
		//初始化一個變量sum用來累加對角綫上的元素之和
		int sum = 0;
		
		for (int i =0;i<array.length;i++) {
			sum=sum+array[i][i];
		}
		System.out.println(sum);
	}
}
