package Arrays.ArraysProblems_Easy;

import java.util.Collections;
import java.util.Scanner;

public class FindLargestElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        int maxValue = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (maxValue<arr[i]){
                    maxValue = arr[i];
                }
            }
        System.out.println(maxValue);
    }
}
