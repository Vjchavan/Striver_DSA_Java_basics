package Java_Basics;

import java.util.Scanner;

public class DetermineLeapYear {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        if(year%4==0&&year%100!=0){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("Normal year");
        }
    }

}
