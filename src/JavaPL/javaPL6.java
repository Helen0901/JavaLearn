/**
 * 
int[] array = new int[4]の配列のSUMを求める
 */
package JavaPL;

public class javaPL6 {
	public static void main (String[]args) {
		int[] array= new int[4];
		int sum = 0;
		for(int i =0;i< array.length; i++) {
			sum = sum + array[i] ;
		}
		System.out.println(sum);
	}

}
