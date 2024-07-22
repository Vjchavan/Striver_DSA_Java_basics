package Strings;

import java.util.Scanner;

public class DefaningIPAddress {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        s = s.replaceAll("[.]","[.]");
        System.out.println(s);
    }
}
