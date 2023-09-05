package LearnBasicRecursion;

import java.util.Scanner;

public class SumOfN {
    static long sum=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(sumFirstN(n));

    }

//    public static long sumFirstN(long n) {
//        if (n==0){
//            return sum;
//        }
//        sum = sum + n;
//        sumFirstN(n-1);
//        return sum;
//    }


    public static long sumFirstN(long n) {
        long sum = 0;
        sum = n*(n+1)/2;
        return sumFirstN(n-1);
    }

}
