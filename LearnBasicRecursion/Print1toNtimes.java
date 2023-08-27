package LearnBasicRecursion;

import java.util.Scanner;

public class Print1toNtimes {
    static int count=0;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();



    }

    static void printNTimes(int []arrays,int n){
        if (count==n){
            return;
        }
        arrays[count] = count + 1;
        count++;
        printNTimes(arrays,n);
    }

}
