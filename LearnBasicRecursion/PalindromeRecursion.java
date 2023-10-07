package LearnBasicRecursion;

import java.util.Scanner;

public class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(checkPalindrome(0, str));
    }

    private static Boolean checkPalindrome(int i, String str) {

        if(i>str.length()-1) return true;

        if (str.charAt(i)!=str.charAt(str.length()-i-1)) return false;

        return checkPalindrome(i+1,str);
    }
}
