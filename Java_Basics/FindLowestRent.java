package Java_Basics;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindLowestRent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

        List<Integer> A = Arrays.asList(4000,2000,850,600);
        List<Integer> B = Arrays.asList(2,2,3,3);
        int k = sc.nextInt();

        int min_rent = 0;
        for (int i = 0; i < B.size(); i++) {
            if (B.get(i)==k){
                System.out.println(B.get(i));
            }
//            if(B.get(i)==k){
//                min_rent = Math.min(min_rent,A.get(i));
//            }
        }
        System.out.println(min_rent);
    }
}
