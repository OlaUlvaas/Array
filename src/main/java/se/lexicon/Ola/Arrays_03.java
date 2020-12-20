package se.lexicon.Ola;

import java.util.Arrays;
import java.util.Scanner;

/**
 *                       Week2 - Java Arrays - Excersises
 *
 *
 *   3.Write a program which will sort string array.
 *     Expected output:String array: [Paris, London, New York, Stockholm]
 *     Sort string array: [London, New York, Paris, Stockholm]
 */

public class Arrays_03 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHow many Capital Cities do you want to store in the array?: ");
        int size = scanner.nextInt();
        System.out.println("\nType in " + size + " Capital Cities please: ");

        String[] capitalCities = new String[size+1];

        for (int i = 0; i < capitalCities.length; i++) {
            capitalCities[i] = scanner.nextLine();
        }

        String[] copy = Arrays.copyOfRange(capitalCities, 1, capitalCities.length);
        System.out.println("\nUnsorted array: " + Arrays.toString(copy));
        Arrays.sort(copy);
        System.out.println("\nSorted array: " + Arrays.toString(copy));


    }
}
