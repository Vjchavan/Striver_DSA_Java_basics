package Hashing;

import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int res[] = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = arr[i]++;
        }

        for (int a:res) {
            System.out.println(a);
        }
    }
}
