package Hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Find_Highest_Lowest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        TreeSet<Integer> hash = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (hash.contains(arr[i])) continue;

            hash.add(arr[i]);
        }

        System.out.println(hash);
    }

}
