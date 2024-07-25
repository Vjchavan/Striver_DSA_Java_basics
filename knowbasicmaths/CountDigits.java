package knowbasicmaths;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        long n = in.nextLong();
        int count=0;
        System.out.println("Numbers of Digit :"+recCountDigit(n,count));
        int x = (int) n;
        System.out.println("Number of digits : "+countDigit(x));
        System.out.println("Number of digits divisbile by 'n' : "+countDigits(x));



    }

    private static long recCountDigit(long n,int count) {
        if (n<=0){
            return count;
        }
        n = n/10;
        count++;

        return recCountDigit(n,count);
    }

    /*
         Counting digits in a given number
     */
    public static int countDigit(int n){
        int lastDigit,count=0;
        for (int i = 0; i < n; i++) {
            while(n!=0){
                lastDigit = n % 10;
                count++;
                n=n/10;
            }
        }
        return count;
    }

    /*
        LeetCode Problem - "Find the number of digits of 'n' that evenly divide 'n'."
     */

    public static int countDigits(int n){
        int lastDigit,count=0,oldnum=n;
        for (int i = 0; i < n; i++) {
            while (n!=0){
                lastDigit=n%10;
                if (lastDigit!=0 && oldnum%lastDigit==0){
                    count++;
                }
                n = n/10;
            }
        }
        return count;
    }
}
