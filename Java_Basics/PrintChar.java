package Java_Basics;

import java.util.Scanner;

public class PrintChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        System.out.println(n);

        for (int i = 1; i < n.length(); i=i+2) {
            int num = Integer.parseInt(String.valueOf(n.charAt(i)));
            for (int j = 0; j < num ; j++) {
                System.out.print(n.charAt(i-1));
            }
        }
    }
}
