package SortingAlgos;

import java.util.Scanner;

public class SelectionSortSubArrays {

    public static void main(String[] args) {

        int maxSum = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n ; j++) {

                int sum = 0;


                for (int k = i; k <=j ; k++) {

                    sum = sum + arr[k];
                    if (maxSum < sum){
                        maxSum = sum;
                    }
                }
            }
        }

        System.out.println(maxSum);
    }

}
