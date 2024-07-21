package Java_Basics;

import java.util.Scanner;

public class CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int units = in.nextInt();
        double billAmount = calculateBill(units);
        System.out.println(billAmount);
    }

    private static double calculateBill(int units) {
        if(units<=50){
            return units * 0.50;
        }
        else if(units<=150){
            return (50*0.50) + ((units - 50)*0.75);
        }
        else if(units<=250){
            return (50*0.50) + (100*0.75) + ((units - 150)*1.20);
        }
        else{
            return (50*0.50) + (100*0.75) + (100*1.20) + ((units - 250)*1.50);
        }
    }


}
