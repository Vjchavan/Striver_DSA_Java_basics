package Strings;

import java.util.Scanner;

public class RemoveVowelsFromString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.toUpperCase();
        s = s.replaceAll("[AEIOU]","");
        System.out.println(s);

    }
}
