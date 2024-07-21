package Java_Basics;

import java.util.Scanner;

public class VowelOrConstant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                    System.out.println("Vowels" + " "+ s.charAt(i));
                }
            }else {
                System.out.println("Constants" + " " + s.charAt(i));
            }


        }


    }
}
