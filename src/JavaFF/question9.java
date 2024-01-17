/**
 * 質問９︓メソッドの呼び出す練習。
1. 質問６-１を⽤い、２つ配列をマージします。
2. 質問８を⽤い、ステップ１のマージした配列をソートする。
3. 注意︓コードを１⾏にしてください。
 */
package JavaFF;

public class question9 {
	public static void main (String[] args) {
		int[] left = new int[] { 1, 2, 3, 4 };
		int[] right = new int[] { 5, 6, 7, 8 };
		int[] temp =megerArray(left,right);
		int[] result = bubbleSort(megerArray(left,right));
		printArray(result);
	}
	public static int[] megerArray(int[] left, int[] right){
		
		int[] temp =  new int [left.length + right.length];
	
		for(int i = 0;i< left.length;i++) {
			temp[i] = left[i];
		}
		for(int j = 0;j< right.length;j++) {
			temp[left.length+j] = right[j];
	}
		return temp;
	}
	public static int[] bubbleSort(int[] temp) {
		int[] result =  temp;
		for(int i = 0; i<temp.length-1; i++) {
			for(int j = 0; j<temp.length-i-1; j++) {
				if(temp[j]>temp[j+1]) {
					temp[j]= temp[j+1];
					result[j] = temp[j];
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

