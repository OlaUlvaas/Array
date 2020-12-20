package se.lexicon.Ola;

import java.util.Arrays;
import java.util.Scanner;

/**
 *                       Week2 - Java Arrays - Excersises
 *   7.Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
 *     Expected output:Array: 1 2 4 7 912Odd Array: 1 7 9
 *
 */
public class Arrays_07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers will you store in the array?: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int[] copy = new int[size];

        System.out.println("Type in " + size + " numbers please: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();


        }

        Arrays.sort(numbers);
        System.out.println("\nAll numbers: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

        copy = Arrays.copyOfRange(numbers, 0, numbers.length);
        Arrays.sort(copy);
        System.out.println("\n\nUneven numbers: ");
        for(int i = 0; i < copy.length; i++){
            if(copy[i] % 2 == 1){
                System.out.print(copy[i] + " ");
            }
        }
    }


}
