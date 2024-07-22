package Strings;

import java.util.Scanner;

public class JewelsAndStones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String jewels = in.nextLine();
        String stones = in.nextLine();
            int count = 0;

            for (int i = 0; i < jewels.length(); i++) {
                for (int j = 0; j < stones.length(); j++) {
                    if (jewels.charAt(i)==stones.charAt(j)){
                        count++;
                    }
                }
            }
        System.out.println("Jewels Count: "+count);
    }
}
