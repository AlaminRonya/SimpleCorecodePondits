import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private  static int count=0;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int n;
//        System.out.print("Enter your array size : ");
//        n = Integer.parseInt(bufferedReader.readLine().trim());
//        int[] arr = new int[n];
//        System.out.println();
//        System.out.println("Enter the number : ");
//        for (int i = 0; i<n ; i++){
//            arr[i] = Integer.parseInt(bufferedReader.readLine().trim());
//        }
//        for (int i = 0; i<n ; i++){
//            String s = String.valueOf(arr[i]);
////            int a = s.length()%2;
//            if ((s.length()%2)==0){
//                System.out.println("Even number : "+arr[i]);
//            }



//        int arr[] = {7,1,3,5,6,2,44,7,5};
//        int smallest = Integer.MAX_VALUE;
//        int secondSmallest = Integer.MAX_VALUE;
//        for (int i = 0; i<arr.length; i++){
//            if (arr[i]<smallest){
//                secondSmallest = smallest;
//                smallest = arr[i];
//
//            }else if (arr[i] < secondSmallest){
//                secondSmallest = arr[i];
//            }
//
//        }
//        System.out.println(secondSmallest);
//        System.out.println(Arrays.toString(arr));

//        DynamicArray dynamicArray = new DynamicArray();
//        dynamicArray.addItem(10);
//        dynamicArray.addItem(10);
//        dynamicArray.print();
//        System.out.println("Size of Array : "+dynamicArray.size());
//        dynamicArray.addItem(11);
//        dynamicArray.addItem(11);
//        dynamicArray.addItem(11);
//        dynamicArray.addItem(12);
//        dynamicArray.addItem(12);
//        dynamicArray.addItem(12);
//        dynamicArray.addItem(12);
//        dynamicArray.print();
//        System.out.println("Size of Array : "+dynamicArray.size());
        AutoGenerateArraySize autoGenerateArraySize = new AutoGenerateArraySize();
//        autoGenerateArraySize.addElement(10);
//        autoGenerateArraySize.addElement(10);
//        autoGenerateArraySize.addElement(10);
//        autoGenerateArraySize.addElement(10);
//        autoGenerateArraySize.addElement(12);
//        autoGenerateArraySize.addElement(13);
        autoGenerateArraySize.show();
        System.out.println("aa " +autoGenerateArraySize.removeItem());
        System.out.println(autoGenerateArraySize.removeItem());
        autoGenerateArraySize.show();


    }


}
