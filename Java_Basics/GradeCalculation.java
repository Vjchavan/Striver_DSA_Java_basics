package Java_Basics;

import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n!=0){
            if(n<=100&&n>=90){
                System.out.println("A");
            }
            else if(n<=89&&n>=80){
                System.out.println("B");
            }
            else if(n<=79&&n>=70){
                System.out.println("C");
            }
            else if(n<=69&&n>=60){
                System.out.println("D");
            }
            else {
                System.out.println("F");
            }
        }
    }
}
