package ArraysProblems_Easy;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElementArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(arr[n-2]+" "+arr[1]);
    }
}
