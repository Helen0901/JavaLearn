/**
 * 問題


main メソッド内で、二次元配列の要素の合計を計算してください。
二次元配列はハードコーディングされているものとします。

入力

特に入力はありません。二次元配列はコード内に直接定義されています。

出力

二次元配列の要素の合計値を出力してください。
 */
//com.ct 01パッケージ内のJavaPL 28というクラスを定義する
package com.ct01;
public class JavaPL28 {
	public static void main(String[] args) {
		//3*3の行列を含む2次元整数配列arrayを定義する
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //配列内のすべての要素の値を加算するための変数sumの初期化
        int sum = 0;

        
       //レイヤ1のループ、配列の行をトラバースするレイヤ1のループ
        for (int i = 0; i < array.length; i++) {
        	//レイヤ2のループ、配列の列を巡回
            for (int j = 0; j < array[i].length; j++) {
            	//現在の要素の値をsumに加算
                sum += array[i][j];
            }
        }

        //配列のすべての要素の和を出力
        System.out.println("二次元配列の要素の合計: " + sum);
    }
}
