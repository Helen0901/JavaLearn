/*問題:
整数の配列のすべての要素の合計を計算するメソッドsumArrayを作成してください。

入力:
整数の配列（例: [1, 2, 3, 4, 5]）

出力:
合計値（例: 15）*/
package com.ct01;

public class JavaFF38 {
	public static void main (String[]args) {
		 int[] array = {1, 2, 3, 4, 5};
		 System.out.println(sumArray(array));
	}
	 public static int sumArray(int[] array) {
	        int sum = 0;
	        for (int num : array) {
	            sum += num;
	        }
	        return sum;
	    }

}
