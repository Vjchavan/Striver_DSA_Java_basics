package knowbasicmaths;

import java.util.Scanner;

public class GCDorHCF {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = in.nextInt();
        int m = in.nextInt();

        System.out.println(gcd(n,m));

    }

    private static int gcd(int n, int m) {
        while(n>0 && m>0){
            if(n>m){
                n = n % m;
            }
            else
                m = m % n;
        }
        if(n==0){
            return m;
        }
        else return n;
    }

}
