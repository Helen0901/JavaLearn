import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class java6 {
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
