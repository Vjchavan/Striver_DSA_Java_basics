package Arrays.ArraysProblems_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindTargetIndicesAfterSortingArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        int target = in.nextInt();

        List<Integer> result = new ArrayList<>();
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                result.add(i);
            }
        }

        System.out.println(result);

    }

}
