/**
 * 問題:

整数の二次元配列が与えられた場合に、その配列の行と列を交換して、新しい配列を作成し出力してください。
この操作を「転置」と呼びます。二次元配列は正方形（同じ数の行と列）と仮定してかまいません。二次元配列はハードコーディングされているものとします。

入力:
特に入力はありません。二次元配列はコード内に直接定義されています。

出力:
行と列が交換された新しい配列を出力してください。
 */
package com.ct01;
//com.ct 01パッケージ内のJavaPL 30というクラスを定義する
public class JavaPL30 {
	//主クラス
	public static void main(String[]args) {
		//2 D整数配列arrayを定義して初期化する
		int[][]array = {{1,2,3},{4,5,6},{7,8,9}};
		//行列の転置結果を格納し、行列の入れ替えを行うための新しい2 D整数配列transposedを作成します。
		int[][]transposed = new int[array.length][array.length];
		
		//レイヤ1のループ、元の配列の行を巡回
		for(int i=0; i<array.length;i++){
			//レイヤ2のループ、元の配列の列を巡回
			for (int j = 0; j < array[i].length; j++) {
				//元の配列の要素を転置配列に行列変換して格納する
                transposed[j][i] = array[i][j];
            } 
		}
		//レイヤ3ループ、転置配列の行をトラバースする
		 for (int i = 0; i < transposed.length; i++) {
			 //レイヤ4サイクル、転置配列の列をトラバースする
	            for (int j = 0; j < transposed[i].length; j++) {
	            	//転置配列の要素を出力
	                System.out.print(transposed[i][j] + " ");
	            }
	            //折り返し
	            System.out.println();
	        }
     }
}