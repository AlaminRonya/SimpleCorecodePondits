import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReversePalindrome {
    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        str = bufferedReader.readLine().trim();
        int len = str.length();
        String palindrome="";
        for (int i = len-1; i>=0; i--){
            palindrome+=str.charAt(i);

        }
        if (str.equals(palindrome)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

}
