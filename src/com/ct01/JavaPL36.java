/**
 * 問題:
Javaの main メソッド内で、文字列の配列が与えられた場合に、配列内の全ての文字列に共通する最長の接頭辞を見つけ出してください。もし共通の接頭辞が存在しない場合は、空文字列を出力してください。配列はハードコーディングされているものとします。

入力:
特に入力はありません。文字列の配列はコード内に直接定義されています。

出力:
全ての文字列に共通する最長の接頭辞を出力してください。存在しない場合は空文字列を出力してください。
 */
package com.ct01;

public class JavaPL36 {
	 public static void main(String[] args) {
	        String[] strs = {"flower", "flow", "flight"};
	        if (strs.length == 0) {
	            System.out.println("");
	            return;
	        }

	        String prefix = strs[0];
	        for (int i = 1; i < strs.length; i++) {
	            while (strs[i].indexOf(prefix) != 0) {
	                prefix = prefix.substring(0, prefix.length() - 1);
	                if (prefix.isEmpty()) {
	                    System.out.println("");
	                    return;
	                }
	            }
	        }

	        System.out.println("共通の接頭辞: " + prefix);
	    }
}
