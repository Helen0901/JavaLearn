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
package com.ct01;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Java15 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String email = scanner.nextLine();

	        String emailRegex = "^[\\w.-]+@[\\w.-]+\\.[\\w]{2,}$";
	        Pattern pattern = Pattern.compile(emailRegex);
	        Matcher matcher = pattern.matcher(email);

	        if (matcher.matches()) {
	            System.out.println("メールアドレスのフォーマットが正しいです");
	        } else {
	            System.out.println("メールアドレスのフォーマットが正しくないです");
	        }
	    }
}
