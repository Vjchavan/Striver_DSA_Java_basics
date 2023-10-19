package Hashing;

import java.util.*;

public class Find_Highest_Lowest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {

                hm.put(arr[i], hm.get(arr[i])+1);

            } else {

                hm.put(arr[i], 1);

            }
        }

        int maxEle=0;
        int minEle=0;
        int minFreq=arr.length;
        int maxFreq=0;

        for(Map.Entry<Integer, Integer> ele : hm.entrySet()){
            int freq = ele.getValue();
            int element = ele.getKey();

            if(freq > maxFreq){
                maxEle = element;
                maxFreq = freq;
            }

            if(freq < minFreq){
                minEle = element;
                minFreq = freq;
            }

        }

        System.out.println(maxFreq+"  "+minFreq);

    }

}
