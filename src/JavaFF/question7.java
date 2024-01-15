/**
 * 1. メソッド名︓trim
2. 引数１︓charの配列
3. 戻り値︓charの配列
4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
以下メソッドの実施例:
char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '}; // 入力引数
// メソッドを実施後
char[] output = new char[] {'A', 'b', ' ', ' ', 'C'}; // 入力引数
 */
package JavaFF;

public class question7 {
	public static void main (String[]args) {
		char[] input = new char[] {' ',' ','A','b',' ',' ','C',' '};
		char[] output = trim(input);
		printArray(output);
	}
	public static char[] trim(char[] input) {
		
		int startIndex = 0;
		int endIndex = 0;
		
		for(int i = 0; i<input.length; i++) {
			
			if(input[i]!=' ') {
				startIndex = i;
				break;
			}
		}	
		
		for(int i = input.length-1 ; i<input.length; i--) {
			if(input[i]!=' ') {
		        endIndex = i;
				break;
			}
		}
			char[] output = new char[endIndex-startIndex+1];
			for (int j =0; j<output.length;j++) {
				output[j] = input[startIndex + j]; 
			}
			return output;
		}
	public static void printArray(char[] objs) {
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



