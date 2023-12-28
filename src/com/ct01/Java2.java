/**
 * 問題

2つの文字列変数を宣言し、それらを連結して出力するJavaプログラムを書いてください。

出力

2つの文字列変数を連結した結果。
 */
// パッケージ宣言: com.ct01 パッケージに所属する
package com.ct01;

// Java2 クラスの定義
public class Java2 {
    // main メソッドの定義
    public static void main(String[] args) {
        // 文字列変数 hello に "こんにちは" を代入
        String hello = "こんにちは";

        // 文字列変数 world に "世界" を代入
        String world = "世界";

        // hello と world の文字列を結合し、その結果を出力
        System.out.println(hello + world);
    }
}
