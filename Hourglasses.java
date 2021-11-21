import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Hourglasses {
    public static void main(String[] args) throws IOException {


//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] numArray = new String[6];
//        int largestSum = 0;
//        for(int i=0; i<6; i++){
//                numArray[i]=bufferedReader.readLine().trim();
//        }
//        int[][]arr = new int[6][6];
//        for (int i=0;i<6;i++){
//            String[] split = numArray[i].split("\\s+");
//            int k=0;
//            for (String x: split){
//                if(k==6){
//                    break;
//                }
//                arr[i][k++]=Integer.parseInt(x);
//            }
//        }
//        for (int i=0;i<=3;i++){
//            for (int j=0;j<=3; j++){
//                int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
//                if(i==0 && j==0){
//                    largestSum=sum;
//                }else{
//                    if(sum>largestSum){
//                        largestSum=sum;
//                    }
//                }
//            }
//        }
//
//
//        System.out.println(largestSum);

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array1= new int[n];
        for(int i=0;i<n;i++){
            array1[i]=sc.nextInt();
        }
        int count=0;
        for(int j=0;j<n;j++){
            int sum=0;
            for(int k=j;k<n;k++){
                sum=array1[k]+sum;
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
