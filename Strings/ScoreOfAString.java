package Strings;

import java.util.Scanner;

public class ScoreOfAString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length()-1; i++) {
            sum += (Math.abs(Integer.valueOf(s.charAt(i))-Integer.valueOf(s.charAt(i+1))));
        }
        System.out.println(sum);
    }
}
