package se.lexicon.Ola;

import java.util.Arrays;
import java.util.Scanner;

/**
 *                       Week2 - Java Arrays - Excersises
 *
 *   8.Write a program which will remove the duplicate elements of a given array
 *     [20, 20, 40, 20, 30, 40, 50, 60, 50].
 *     Expected output:Array: 20 20 40 20 30 40 50 60 50 Array without duplicate values: 20 40 30 50 60
 */
public class Arrays_08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to fill the array with?: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int[] copy = new int[size];
        int[] trash = new int[size];
        System.out.println("Type in " + size + " numbers: \n");


        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);


        for(int i = 0; i < numbers.length -1; i++){
            if(numbers[i] == numbers[i + 1]){
                trash[i] = numbers[i];
            }
            else{
                copy[i] = numbers[i];
                copy[copy.length - 1] = numbers[numbers.length - 1];
            }
        }

        System.out.print("\nAll numbers: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\nWithout duplicates: ");
        for(int i = 0; i < copy.length; i++){
            if(numbers[i] == 0 && numbers[i] != numbers[i + 1]){
                System.out.print(numbers[i] + " ");
            }
            else if(copy[i] != 0){
                System.out.print(copy[i] + " ");
            }
        }


    }
}
