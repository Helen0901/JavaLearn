/**
 * 問題

キーボードから6つの整数を入力し、それらを配列に格納した後、配列の中で最大値と最小値を見つけて出力するプログラムを書いてください。最大値と最小値が同じ値であれば、その値を一度だけ出力します。最大値と最小値が異なる値で、それぞれの値が複数存在する場合でも、各値を一度だけ出力します。

入力

ランダムに入力された6つの整数。

出力

配列の最大値と最小値（重複の同値があっても一度だけ出力）。
 */
package com.ct01;
import java.util.Scanner;
public class JavaPL26 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner (System.in);
		int[]numbers = new int [6];
		for(int i = 0; i <6;i++) {
			numbers[i]=scanner.nextInt();
			}
		
		  int max = numbers[0];
		  int min = numbers[0];
		  for(int i =1;i<numbers.length; i++) {
			  if (numbers [i] > max){
				  max = numbers [i];
			  }
			  if (numbers[i]<min){
				  min = numbers[i];
			  }
		  }
	     if (max==min) {
	    	System.out.println(max);
	    } else {
            System.out.println(max + " " + min);
	    }
	}
}
