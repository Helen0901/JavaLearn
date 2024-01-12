/**
 * 質問６-２︓以下静的なメソッドを定義してください。
1. メソッド名: subArray
2. 引数１︓intの配列 array
3. 引数２︓開始のstartIndex
4. 引数３︓⻑さlength
5. 戻り値︓intの配列
6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
以下メソッドの実施例:
int[] array = new int[] {1, 2, 3, 4};
// start = 1, length = 2
int[] result = new int[] {2, 3}
 */
package JavaFF;

public class question62 {
	 public static void main(String[] args) {
	        int[] array = new int[] {1, 2, 3, 4};

	        // メソッドの実施例
	        int startIndex = 1;
	        int length = 2;
	        int[] result = subArray(array, startIndex, length);

	        // 結果の出力
	        printArray(result);
	    }

	    // subArrayメソッドの定義
	    public static int[] subArray(int[] array, int startIndex, int length) {
	        // 引数の値が不正な場合や配列の範囲外を考慮することも重要です
	        if (startIndex < 0 || startIndex + length > array.length || length < 0) {
	            throw new IllegalArgumentException("Invalid startIndex or length");
	        }

	        int[] subArray = new int[length];

	        for (int i = 0; i < length; i++) {
	            subArray[i] = array[startIndex + i];
	        }

	        return subArray;
	    }

	    // 配列を出力するメソッド
	    public static void printArray(int[] array) {
	        System.out.print("[");
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i]);
	            if (i < array.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	    }

}
