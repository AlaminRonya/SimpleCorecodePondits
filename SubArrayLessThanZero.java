import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubArrayLessThanZero {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String num = bufferedReader.readLine().trim();
        String[] split = num.split("\\s+");
        int count = 0;
        for (int i =0; i<split.length; i++){
            int sum = 0;
            for (int j=i;j<split.length;j++){
                sum +=Integer.parseInt(split[j]);
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);

//        i=0;
//        int count= 0;
//        while (i<n){
//            int sum = 0;
//            for (int j=i;j<n;j++){
//                sum +=arr[j];
//            }
//            if (sum<0){
//                count++;
//            }
//        }
//        System.out.println(count);

    }
}
