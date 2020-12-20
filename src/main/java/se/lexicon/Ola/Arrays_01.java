package se.lexicon.Ola;

import java.util.Arrays;
import java.util.Scanner;

/**
 *                  Week2 - Java Arrays - Excersises
 *
 *   1.Write a program which will store elements in an array of type 'int' and print it out.
 *     Expected output:11 23 39 etc.
 */
public class Arrays_01 {

    public static void main(String[] args){

        theArray();
    }


    public static void theArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        final int SIZE = scanner.nextInt();
        int[] numbers = new int[SIZE];
        System.out.println("Enter " + SIZE + " numbers: ");
        for(int i = 0; i < SIZE; i++){
            //System.out.println("Enter a number: ");
            int input = scanner.nextInt();
            numbers[i] = input;

        }

        //System.out.println(Arrays.toString(numbers));
        for(int number : numbers){
            System.out.print(" " + number);
        }
    }
}
