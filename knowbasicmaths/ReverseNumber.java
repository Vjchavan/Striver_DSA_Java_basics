package knowbasicmaths;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rev = 0,oldNum=n,lastDigit=0;
        while (n!=0) {
            lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n = n / 10;
        }
        System.out.println(rev);
    }

}
