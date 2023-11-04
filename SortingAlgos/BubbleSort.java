package SortingAlgos;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        bubbleSort(arr,n);

    }

    private static void bubbleSort(int[] arr, int n) {
        for (int i = n-1; i <=0; i--) {
            int didSwap = 0;
            for (int j = 0; j <=i-1 ; j++) {
                if (arr[j] > arr[j+1]) {

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap==0){
                break;
            }
        }

        for (int a:arr) {
            System.out.println(a);
        }

    }
}
