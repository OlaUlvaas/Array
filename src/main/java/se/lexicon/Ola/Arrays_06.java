package se.lexicon.Ola;

import java.util.Arrays;
import java.util.Scanner;

/**
 *                       Week2 - Java Arrays - Excersises
 *
 *   6.Write a program which will set up an array to hold the next values in this order: 43, 5, 23, 17, 2, 14
 *     and print the average of these 6 numbers.Expected output:Average is: 17.3
 */
public class Arrays_06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to hold in the array?: ");
        int size = scanner.nextInt();
        double[] numbers = new double[size];
        double sum = 0;
        System.out.println("Type in " + size + " numbers: ");
        System.out.println("\n");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextDouble();
        }

        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        System.out.println("\nThe average is: " + (sum/size));


    }
}
