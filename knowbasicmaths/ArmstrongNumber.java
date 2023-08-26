package knowbasicmaths;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int oldNum=n,lastDigit=0,sum=0;
        int len = String.valueOf(n).length();
        while (oldNum!=0){
            lastDigit = oldNum % 10;
            sum = sum + (int)(Math.pow(lastDigit,len));
            oldNum = oldNum / 10;
        }
        if (sum==n){
            System.out.println("Number is Armstrong number "+sum);
        }
        else
        System.out.println("Not a ArmStrong number");

    }

}
