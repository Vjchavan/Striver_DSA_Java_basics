package LearnBasicRecursion;

import java.util.Scanner;

public class FibonacciRecursion {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int []arr = new int[n];

         //int out = getFibonacci(n);
        getFibonacciSeries(n);


            //System.out.println(out);
    }

    private static int getFibonacci(int n) {

        if(n<=1){
            return n;
        }
        int last = getFibonacci(n-1);
        int slast = getFibonacci(n-2);

        return last + slast;
    }

    //*****************************************


    private static void getFibonacciSeries(int n) {

        int fib[] = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        for (int a:fib) {
            System.out.println(a);
        }
    }
}
