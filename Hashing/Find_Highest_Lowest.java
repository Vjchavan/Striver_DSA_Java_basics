package Hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Find_Highest_Lowest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        TreeSet<Integer> hash = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (hash.contains(arr[i])) continue;

            hash.add(arr[i]);
        }

        System.out.println(hash);

        //*************** Using TreeMap ********************

        int [] res = new int[2];

        TreeMap<Integer,Integer> map = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            map.put(arr[i],1 );
        }

        System.out.println(map);
    }

}
