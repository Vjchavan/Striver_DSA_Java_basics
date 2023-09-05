package LearnBasicRecursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int factorial=1;
        printFactorial(x,factorial);

    }

    private static void printFactorial(int x, int factorial) {
        if (x<1) {
            System.out.println(factorial);
            return;
        }
        factorial = factorial*x;
        printFactorial(x-1,factorial);
    }
}
