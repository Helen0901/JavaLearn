/**
 * ⾏列（２次元配列）の和と積を計算してください。
 * int[][] array = new int[2][3]
 */
package JavaPL;

public class javaPL7 {
	public static void main (String[]args) {
		int[][] array = new int[2][3];
	
	int sum = 0;
	for(int i =0;i< 2; i++) {
		 for (int j = 0; j < 3; j++) {
			 sum = sum + array[i][j]; 
		 }
	}
	System.out.println(sum);
	
	
	int product = 1;
	for (int i = 0; i < array.length; i++) {
	    for (int j = 0; j < array[i].length; j++) {
	        product = product * array[i][j];
	    }
	}
	System.out.println( product);
}
}	
