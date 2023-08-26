package knowbasicmaths;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAllDivisors {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(printDivisors(n));

    }

    public static List< Integer > printDivisors(int n) {
        // Write your code here
        List<Integer> divisors = new ArrayList<>();
        for(int i=1;i<=n;i++){
                if(n!=0 && n%i==0){
                    divisors.add(i);
                }
        }
        return divisors;
    }

}
