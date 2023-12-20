/**
 * 問題


キーボードから6つの整数を入力し、それらを配列に格納した後、配列の中で最大値と最小値を見つけて出力するプログラムを書いてください。最大値と最小値が同じ値であれば、その値を一度だけ出力します。最大値と最小値が異なる値で、それぞれの値が複数存在する場合でも、各値を一度だけ出力します。

入力

ランダムに入力された6つの整数。

出力

配列の最大値と最小値（重複の同値があっても一度だけ出力）。
 */
//com.ct 01パッケージ内のJavaPL 26というクラスを定義する
package com.ct01;
//JavaのScannerクラスをインポートする
import java.util.Scanner;
//主クラス
public class JavaPL26 {
	public static void main(String[]args) {
		//コンソールから入力を読み込むためのScannerオブジェクトの作成
		Scanner scanner = new Scanner (System.in);
		
		//6つの要素を含む整数配列numbersを定義する
		int[]numbers = new int [6];
		//ユーザーが入力した6つの整数を循環的に読み取り、配列に格納
		for(int i = 0; i <6;i++) {
			numbers[i]=scanner.nextInt();
			}
		
		//配列の最初の要素としてmaxとminを初期化する
		  int max = numbers[0];
		  int min = numbers[0];
		  //配列を巡回し、最大値と最小値を見つける
		  for(int i =1;i<numbers.length; i++) {
			  //より大きな値があるかどうかを判断する
			  if (numbers [i] > max){
				  max = numbers [i];
			  }
			  //より小さな値があるかどうかを判断する
			  if (numbers[i]<min){
				  min = numbers[i];
			  }
		  }
		  //最大値と最小値が等しいか否かを判断し、結果を出力
	     if (max==min) {
	    	System.out.println(max);
	    } else {
            System.out.println(max + " " + min);
	    }
	}
}
