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
	        int[] array = {100, 4, 200, 1, 3, 2};
	        int longestStreak = 0;

	        for (int i = 0; i < array.length; i++) {
	            int currentNum = array[i];
	            int currentStreak = 1;

	            // 前方向の探索
	            boolean found;
	            do {
	                found = false;
	                for (int k = 0; k < array.length; k++) {
	                    if (array[k] == currentNum - 1) {
	                        currentStreak++;
	                        currentNum--;
	                        found = true;
	                        break;
	                    }
	                }
	            } while (found);

	            // 元の数に戻す
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
