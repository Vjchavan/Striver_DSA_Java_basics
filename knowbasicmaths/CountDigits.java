package knowbasicmaths;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = in.nextInt();
        System.out.println("Number of digits : "+countDigit(n));
        System.out.println("Number of digits divisbile by 'n' : "+countDigits(n));




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
