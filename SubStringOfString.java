import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubStringOfString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str =bufferedReader.readLine().trim();
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String list = getSmallestAndLargest(str,n);
        System.out.println(list);
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        for(int i = 0;i<=s.length()-k;i++){
            String subString = s.substring(i,i+k);
            if(i == 0){
                smallest = subString;
            }
            if(subString.compareTo(largest)>0){
                largest = subString;
            }else if(subString.compareTo(smallest)<0)
                smallest = subString;
        }

        return smallest + "\n" + largest;
    }
}
