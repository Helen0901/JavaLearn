/**
 * 問題:
整数の配列が与えられた場合に、その配列内の「ピーク」要素を見つけ出してください。
「ピーク」とは、その要素が隣接する要素よりも大きい場合を指します。
配列の最初または最後の要素が隣接する単一の要素より大きい場合、それらもピークとみなされます。
配列内に複数のピークがある場合は、どれでも一つを出力して構いません。
配列はハードコーディングされているものとします。
入力:
特に入力はありません。配列はコード内に直接定義されています。
出力:
配列内のピーク要素を一つ出力してください。
 */
//Javaプログラムのパッケージ名の指定
package com.ct01;

//JavaPL 32というクラスを定義する
public class JavaPL32 {
	//メインプログラムのエントリポイント
	public static void main(String[] args) {
		//数値1、7、17、8、3、2を含む整数配列を作成します。
        int[] array = {1, 7, 17, 8, 3, 2};

        //forループを使用して配列内の要素をトラバースする
        for (int i = 0; i < array.length; i++) {
        	//「peak」要素であるかどうかをチェックします。つまり、その要素が前後の要素よりも大きい（ある場合）
        	 if ((i == 0 || array[i] > array[i - 1]) && (i == array.length - 1 || array[i] > array[i + 1])) {
        		 //「peak」要素の場合は、要素を出力してループを終了します
                System.out.println("ピーク要素: " + array[i]);
                break;
            }
        }
	}
}