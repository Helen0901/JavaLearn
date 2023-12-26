/**
 * 問題

正規表現を使用して、メールアドレスのフォーマットが合法かどうかを検証するJavaプログラムを書いてください。
ユーザーが入力したメールアドレスがフォーマットに合致すれば「メールアドレスのフォーマットが合法です」と出力し、
そうでなければ「メールアドレスのフォーマットが不合法です」と出力してください。

入力

任意の文字列。

出力

入力されたメールアドレスのフォーマットが合法か不合法かに基づいて、「メールアドレスのフォーマットが合法です」または
「メールアドレスのフォーマットが不合法です」と出力します。
 */
// パッケージの宣言
package com.ct01;

// Scannerクラスと正規表現関連のクラスのインポート
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// クラスの定義
public class Java15 {
    // メインメソッドの定義
    public static void main(String[] args) {
        // Scannerクラスのインスタンスを生成し、標準入力からメールアドレスの入力を受け取る
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();

        // メールアドレスの正規表現パターンを定義
        String emailRegex = "^[\\w.-]+@[\\w.-]+\\.[\\w]{2,}$";

        // 正規表現パターンをコンパイルしてPatternオブジェクトを生成
        Pattern pattern = Pattern.compile(emailRegex);

        // メールアドレスとパターンを照合するMatcherオブジェクトを生成
        Matcher matcher = pattern.matcher(email);

        // メールアドレスのフォーマットが正しいかどうかを判定し、結果を出力する
        if (matcher.matches()) {
            System.out.println("メールアドレスのフォーマットが正しいです");
        } else {
            System.out.println("メールアドレスのフォーマットが正しくないです");
        }
    }
}
