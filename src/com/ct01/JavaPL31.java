/**
 * 問題:
整数の配列が与えられた場合に、その配列内に重複する要素を検出し、
それぞれの重複要素を一度だけ出力してください。
配列はハードコーディングされているものとします。

入力:
特に入力はありません。配列はコード内に直接定義されています。

出力:
配列内に存在する重複する各要素を一度ずつ出力してください。
 */
package com.ct01;
//com.ct 01パッケージ内のJavaPL 31というクラスを定義する
public class JavaPL31 {
	//マスタメソッド
	public static void main(String[]args) {
		//整数配列arrayを定義して初期化する
		int []array = {7,8,7,6,8,5,4,3};
		//配列内の繰返し要素をマークするためのブール配列isDuplicateを定義する
		boolean[] isDuplicate = new boolean[array.length];
		
		//レイヤ1のループ、配列要素のトラバース
		for (int i = 0; i < array.length; i++) {
			//レイヤ2ループ、現在の要素の次の要素から比較
			for (int j = i + 1; j < array.length; j++) {
				//重複要素が存在し、現在の要素が重複としてマークされていないかどうかを判断する
				if (array[i] == array[j] && !isDuplicate[i]) {
					//繰り返し要素のタグ付け
					isDuplicate[j] = true;	
				}       
			}
		}
		//配列を巡回し、繰り返しとしてマークされた要素を出力する
		for (int i = 0; i < array.length; i++) {
            if (isDuplicate[i]) {
                System.out.print(array[i] + " ");
            }
        }
		
	}
}
