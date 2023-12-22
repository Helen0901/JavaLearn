/**
 * 問題:
Javaの main メソッド内で、文字列の配列が与えられた場合に、配列内の全ての文字列に共通する最長の接頭辞を見つけ出してください。もし共通の接頭辞が存在しない場合は、空文字列を出力してください。配列はハードコーディングされているものとします。

入力:
特に入力はありません。文字列の配列はコード内に直接定義されています。

出力:
全ての文字列に共通する最長の接頭辞を出力してください。存在しない場合は空文字列を出力してください。
 */
package com.ct01;

//JavaPL 36というクラスを宣言する
public class JavaPL36 {
	//メインメソッド、プログラムのエントリポイント
	 public static void main(String[] args) {
		 //3つの文字列要素を含む文字列配列strsを宣言する
	        String[] strs = {"flower", "flow", "flight"};
	        
	        //配列長が0の場合は、空の文字列を出力して戻ります
	        if (strs.length == 0) {
	            System.out.println("");
	            return;
	        }

	        //最初の文字列を接頭辞に設定
	        String prefix = strs[0];
	        //配列内の各文字列を巡回する
	        for (int i = 1; i < strs.length; i++) {
	        	//現在の文字列で接頭辞が先頭かどうかを検索
	            while (strs[i].indexOf(prefix) != 0) {
	            	//そうでない場合は、接頭辞の長さを短くします
	                prefix = prefix.substring(0, prefix.length() - 1);
	                //接頭辞が空の場合は、空の文字列を出力して戻ります
	                if (prefix.isEmpty()) {
	                    System.out.println("");
	                    return;
	                }
	            }
	        }

	        //共通接頭辞を出力
	        System.out.println("共通の接頭辞: " + prefix);
	    }
}
