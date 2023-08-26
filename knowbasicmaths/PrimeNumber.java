package knowbasicmaths;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        normalPrime(n);
        primeUsingSqrt(n);
    }

    public static void normalPrime(int n){
        int cnt=0;
        for (int i = 1; i<=n; i++){
            if (n%i==0){
                cnt++;
            }
        }
        if (cnt==2){
            System.out.println("Prime");
        }
        else
            System.out.println("Not Prime");
    }

    public static void primeUsingSqrt(int n){
        if (n!=1){

            for (int i = 2; i<Math.sqrt(n); i++){
                if (n%i==0){
                    System.out.println("Not Prime");
                }
                else System.out.println("Prime");
            }

        }
    }
}
