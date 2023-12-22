/**
 * 問題:
Javaの main メソッド内で、整数の配列が与えられた場合に、その配列のバランスポイントを見つけ出してください。バランスポイントとは、配列の特定の位置で、その位置より前のすべての要素の合計と、その位置より後ろのすべての要素の合計が等しくなる点を指します。配列はハードコーディングされているものとします。バランスポイントが存在する場合はそのインデックスを、存在しない場合は -1 を出力してください。

入力:
特に入力はありません。配列はコード内に直接定義されています。

出力:
バランスポイントのインデックスを出力してください。存在しない場合は -1 を出力してください。
 */
package com.ct01;

public class JavaPL34 {
	 public static void main(String[] args) {
		 //整数要素を含む整数配列arrayを宣言する
	        int[] array = {1, 2, 3, 4, 3, 2, 1};
	        //配列要素の合計を格納するための宣言変数
	        int totalSum = 0;
	        //配列要素を格納するための宣言変数の左側と
	        int leftSum = 0;
	        
	        //配列を巡回し、配列要素の合計を計算する
	        for (int num : array) {
	            totalSum += num;
	        }

	        //配列を再度トラバースし、平衡点を検索する
	        for (int i = 0; i < array.length; i++) {
	        	//左側の和が合計から左側の値と現在の要素を減算した値に等しい場合
	            if (leftSum == totalSum - leftSum - array[i]) {
	            	//バランスポイントのインデックスを出力して返す
	                System.out.println("バランスポイントのインデックス: " + i);
	                return;
	            }
	            //左側と
	            leftSum += array[i];
	        }

	        //バランスポイントが見つからない場合は-1を出力
	        System.out.println("バランスポイントのインデックス: -1");
	    }
}
