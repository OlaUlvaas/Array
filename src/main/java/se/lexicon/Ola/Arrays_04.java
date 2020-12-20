package se.lexicon.Ola;

import java.util.Arrays;
import java.util.Scanner;

/**
 *                       Week2 - Java Arrays - Excersises
 *
 *   4.Write a program which will copy the elements of one array into another array.
 *     Expected output:Elements from first array: 1 15 20 Elements from second array: 1 15 20
 */
public class Arrays_04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] array1;
        int[] array2;

        System.out.println("\nHow many integers do you want to fill the array with?: ");
        int size = scanner.nextInt();
        array1 = new int[size];
        System.out.println("\nType in " + size + " integers please: ");

        for(int i = 0; i < array1.length; i++){
            array1[i] = scanner.nextInt();
        }

        array2 = Arrays.copyOfRange(array1, 0, array1.length);
        System.out.println("\n");
        System.out.print("From the first Array: ");
        for(int i = 0; i < size; i++){
            System.out.print(array1[i] + " ");

        }
        System.out.println("\n");
        System.out.print("From the copy: ");

        for(int i = 0; i < size; i++){
            System.out.print(array2[i] + " ");

        }
    }
}