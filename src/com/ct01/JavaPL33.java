/**
 * 問題:
Javaの main メソッド内で、0と1が混在する整数配列が与えられた場合に、各要素について最も近い0までの距離を計算して新しい配列として出力してください。距離はインデックスの差で測ります。配列はハードコーディングされているものとします。

入力:
特に入力はありません。配列はコード内に直接定義されています。

出力:
各要素から最も近い0までの距離を示す新しい配列を出力してください。
 */
package com.ct01;

public class JavaPL33 {
	 public static void main(String[] args) {
	        int[] array = {1, 0, 2, 1, 0, 1, 2, 3, 4};
	        int[] distances = new int[array.length];
	        int lastZero = Integer.MAX_VALUE / 2;

	        // 左から右へのスキャン
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == 0) {
	                lastZero = i;
	            }
	            distances[i] = i - lastZero;
	        }

	        // 右から左へのスキャン
	        lastZero = Integer.MAX_VALUE / 2;
	        for (int i = array.length - 1; i >= 0; i--) {
	            if (array[i] == 0) {
	                lastZero = i;
	            }
	            distances[i] = Math.min(distances[i], lastZero - i);
	        }

	        // 出力
	        System.out.print("各要素から最も近い0までの距離: ");
	        for (int dist : distances) {
	            System.out.print(dist + " ");
	        }
	    }
	}
