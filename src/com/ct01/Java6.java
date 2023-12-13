/**
 * 問題

浮動小数点数型の変数dがあります。この変数dを四捨五入して整数型の変数iに変換し、変換後のiを出力するJavaプログラムを書いてください。

入力

がランダムに入力した浮動小数点数。

出力

 四捨五入後の整数（小数点以下第一位が5以上の場合は切り上げ、それ以外の場合は切り捨てる）。
 */
package com.ct01;
import java.util.Scanner;
public class Java6 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double d = sc.nextDouble();
	        int i = (int)Math.round(d);
	        System.out.println(i);
	    }
}
