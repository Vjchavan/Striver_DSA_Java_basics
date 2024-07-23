package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];

        for(int i=0;i<n;i++){
            arr[i] = in.next();
        }

        char x = in.next().charAt(0);

        /*
         *  Solution
         */

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(""+x)){
                result.add(i);
            }
        }

        System.out.println(result);

    }
}
