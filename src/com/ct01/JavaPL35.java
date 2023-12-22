/**
 * 問題:
Javaの main メソッド内で、整数の配列が与えられた場合に、その配列内で最も長い連続する数のシーケンス（連続する数字の列）の長さを見つけ出してください。シーケンスの要素は順不同であってもかまいません。配列はハードコーディングされているものとします。

入力:
特に入力はありません。配列はコード内に直接定義されています。

出力:
最長の連続する数のシーケンスの長さを出力してください。
 */
package com.ct01;

public class JavaPL35 {
	 public static void main(String[] args) {
		 //整数要素を含む整数配列arrayを宣言する
	        int[] array = {100, 4, 200, 1, 3, 2};
	        //最長の連続数列を格納する変数の長さを宣言します
	        int longestStreak = 0;

	        //配列内の各要素を巡回する
	        for (int i = 0; i < array.length; i++) {
	        	//現在の要素値の取得
	            int currentNum = array[i];
	            //現在の連続数列の長さの初期化
	            int currentStreak = 1;

	            // 連続数列の前方検索
	            boolean found;
	            do {
	                found = false;
	                //連続配列を前方に検索配列を巡回して現在の要素の前の要素を探す
	                for (int k = 0; k < array.length; k++) {
	                    if (array[k] == currentNum - 1) {
	                        currentStreak++;
	                        currentNum--;
	                        found = true;
	                        break;
	                    }
	                }
	            } while (found);

	            // 現在の要素値を復元
	            currentNum = array[i];
	            
	            // 後方向の探索
	            do {
	                found = false;
	                for (int k = 0; k < array.length; k++) {
	                    if (array[k] == currentNum + 1) {
	                        currentStreak++;
	                        currentNum++;
	                        found = true;
	                        break;
	                    }
	                }
	            } while (found);

	            // 最長シーケンスの更新
	            if (currentStreak > longestStreak) {
	                longestStreak = currentStreak;
	            }
	        }

	        System.out.println("最長の連続する数のシーケンスの長さ: " + longestStreak);
	    }
}
