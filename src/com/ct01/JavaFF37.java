/*問題:
2つの整数の最大公約数を計算するメソッドgcdを作成してください。

入力:
2つの整数（例: 8, 12）

出力:
最大公約数（例: 4）*/
package com.ct01;

public class JavaFF37 {
    public static void main(String[] args) {
        // 2つの整数を指定
        int num1 = 8;
        int num2 = 12;

        // gcdメソッドを呼び出して最大公約数を計算
        int result = gcd(num1, num2);

        // 結果を表示
        System.out.println("最大公約数: " + result);
    }

    // ユークリッドの互除法を使用して最大公約数を計算するメソッド
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
