package Hashing;
import java.util.HashMap;
import java.util.Scanner;

public class FrequenciesofLimitedRangeArrayElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int P = sc.nextInt();

         Solution.frequencyCount(arr,n,P);

    }

}

class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int n, int P) {
        // do modify in the given array

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            int num = arr[i];
            if(num>=1&&num<=P){
                if (map.containsKey(i)) {
                    map.put(i,map.get(i)+1);
                }
                map.put(i,0);
            }
        }

        System.out.println(map);
    }
}
