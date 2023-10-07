package LearnBasicRecursion;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int i=0,r=arr.length-1;
        //reversedArray(arr, i, r);
        reversedArrayUsingSingleVariable(arr,i);


    }

    private static void reversedArrayUsingSingleVariable(int[] arr, int i) {
        if (i>= arr.length/2) return;

        arr[i] = arr[i]+arr[arr.length-i-1];
        arr[arr.length-i-1] = arr[arr.length-i-1] - arr[i];
        arr[i] = arr[i] - arr[arr.length-i-1];


        reversedArrayUsingSingleVariable(arr,i+1);

        for (int j=0;j< arr.length;j++){
            System.out.println(arr[j]);
        }
    }

    public static void reversedArray(int[] arr, int i, int r){

        if (i>=r){
            return;
        }

            int temp = arr[i];
            arr[i] = arr[r];
            arr[r] = temp;
            reversedArray(arr,i+1,r-1);

        for (int j=0;j< arr.length;j++){
            System.out.println(arr[j]);
        }
    }


}

