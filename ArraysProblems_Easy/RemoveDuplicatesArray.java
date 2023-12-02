package ArraysProblems_Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> arr = new ArrayList<>();

        for(int i=0;i<n;i++){
            arr.add(in.nextInt());
        }

        int count = 0;

        for (int a:arr) {
            if(arr.contains(a)){
                count++;
            }
            if(count>1){
                arr.remove(a);
                count = 0;
            }
        }

        System.out.println(arr.size()+1);
    }
}