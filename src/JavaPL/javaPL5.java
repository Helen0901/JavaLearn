/**
 * 問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値を
System.out.println()
 */
package JavaPL;

public class javaPL5 {
	public static void main (String[]args) {
		int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
		int max = array[0];
		int min = array[0];
		
		for(int i =0;i < array.length; i++) {
			if(array[i]>max) {
				 max = array[i];
			}
		}
		for(int j =0;j< array.length; j++) {
			if(array[j]<min) {
				 min = array[j];
			}
		}
		System.out.println( max);
		System.out.println( min);
	}

}
