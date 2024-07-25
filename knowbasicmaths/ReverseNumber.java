package knowbasicmaths;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n);
        int rev = 0,oldNum=n,lastDigit=0;
        while (n!=0) {
            lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n = n / 10;
        }
        System.out.println(rev);

        Solution solution = new Solution();
        System.out.println("Leetcode: "+" "+solution.reverse(oldNum));

    }

}

/*
*
* Leet Code question - Reverse Integer (negative numbers as well)
*
 */

class Solution {
    public int reverse(int x) {
        boolean negative = false;
        if(x<0){
            x = x * -1;
            negative = true;
        }

        long rev = 0;
        int lastDigit = 0;
        while(x>0){
            lastDigit = x % 10;
            rev = (rev*10) + lastDigit;
            if (rev>=Integer.MAX_VALUE||rev<=Integer.MIN_VALUE){
                return 0;
            }
            x = x / 10;
        }

        if(negative==true){
            rev = rev * -1;
        }

        return (int)rev;


    }
}