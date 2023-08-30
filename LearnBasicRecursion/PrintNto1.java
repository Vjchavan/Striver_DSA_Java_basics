package LearnBasicRecursion;

import java.util.Scanner;

public class PrintNto1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []nums = new int[n];
        printNto1(n);
    }

    private static int[] printNto1(int n) {
        int[] a = new int[n];
        printOutput(a,n,0);
        return a;
    }

    private static void printOutput(int[] a, int n, int x) {
        if (n==0){
            return;
        }

        a[x] = n;
        printOutput(a,n-1,x+1);
    }
}
