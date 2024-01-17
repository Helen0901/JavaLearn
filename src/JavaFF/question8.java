/**
 * 質問８︓バブルソート⽤メソッドを作成してください。
1. メソッド名︓bubbleSort
2. 引数１︓intの配列
3. 戻り値︓ソート済みの配列
4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてくださ
い。
 */
package JavaFF;

public class question8 {
	public static void main (String[]args) {
	int[] array ={9,1,6,3,7};
	int[] result = bubbleSort(array);
	printArray(result);
	}
	
	public static int[] bubbleSort(int[] array) {
		int[] result =  array;
		for(int i = 0; i < array.length-1; i++) {
			for(int j = 0; j < array.length-i-1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
				
			}
			
		}
		return result;
	}
	public static void printArray(int[] objs) {
		if (objs == null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (Object obj : objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
}
