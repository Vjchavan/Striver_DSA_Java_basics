package SortingAlgos;

import java.util.Scanner;

public class SelectionSortAlgo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        //Calling Selection Sort function
        selectionSort(arr,n);
    }

    private static void selectionSort(int[] arr, int n) {


        for (int i = 0; i <= n-2 ; i++) {
            int min = i;

            //Finding Minimum element

            for (int j = i; j <= n-1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            //Swapping min element t first index

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

        //Printing Array

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
