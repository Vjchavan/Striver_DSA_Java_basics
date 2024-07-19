package Arrays.ArraysProblems_Medium;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        int target = in.nextInt();

        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        //Solution
        int[] twosum = twosum(arr, target);
        for (int a:twosum) {
            System.out.println(a);
        }
    }

    public static int[] twosum(int []arr,int target){
        int sum = 0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = arr[i]+arr[j];
                if (sum==target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}
