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
		 //整数要素を含む整数配列arrayを宣言する
	        int[] array = {1, 0, 2, 1, 0, 1, 2, 3, 4};
	        //配列長と同じ整数配列distancesを宣言し、各要素から最も近い0までの距離を格納する
	        int[] distances = new int[array.length];
	        //前の0のインデックスを表す変数を初期化します。初期値は整数の最大値の半分に設定されます。
	        int lastZero = Integer.MAX_VALUE / 2;

	        // 左から右へのスキャン
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == 0) {
	                lastZero = i;
	            }
	            //現在の要素から最も近い0までの距離を計算し、distances配列に格納する
	            distances[i] = i - lastZero;
	        }

	        // 右から左へのスキャン
	        lastZero = Integer.MAX_VALUE / 2;
	        for (int i = array.length - 1; i >= 0; i--) {
	            if (array[i] == 0) {
	                lastZero = i;
	            }
	            //現在の要素から最も近い0までの距離を計算し、distances配列の値を小さい値で更新します
	            distances[i] = Math.min(distances[i], lastZero - i);
	        }

	        // 出力
	        System.out.print("各要素から最も近い0までの距離: ");
	        for (int dist : distances) {
	            System.out.print(dist + " ");
	        }
	    }
	}
