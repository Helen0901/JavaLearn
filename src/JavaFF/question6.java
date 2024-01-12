/**
 * 質問６-０:配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintしま
す。以下メソッドを呼び出してください。
 */
package JavaFF;

public class question6 {
	public class Main {
	    public static void main(String[] args) {
	        // 配列の作成
	        Integer[] array = {1, 2, 3, 4, 5};

	        // printArrayメソッドの呼び出し
	        printArray(array);
	    }

	    // printArrayメソッドの定義
	    public static void printArray(Object[] objs) {
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
}
