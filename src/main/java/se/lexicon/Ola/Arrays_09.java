package se.lexicon.Ola;


import java.util.Arrays;
import java.util.Scanner;

/**
 *                       Week2 - Java Arrays - Excersises
 *
 *   9.Write a method which will add elements in an array.
 *     Remember that arrays are fixed in size so you need to come up with a solution to "expand" the array.
 */


public class Arrays_09 {
    public static void expandArray(String[] names){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHow many new names do you want to expand the array with?: ");
        int newNames = scanner.nextInt();
        String[] moreNames = new String[newNames];
        System.out.println("Type in " + newNames + " names in the second array please: ");
        moreNames[0] = scanner.nextLine();

        for(int i = 0; i < moreNames.length; i++){
            moreNames[i] = scanner.nextLine();
        }
        System.out.println("\nFirst Array: " + Arrays.toString(names));
        System.out.println("\nSecond Array: " + Arrays.toString(moreNames));
        String[] allNames = Arrays.copyOf(names, names.length + moreNames.length);

        for(int i = 0; i < moreNames.length; i++){
            allNames[i + names.length] = moreNames[i];

        }
        System.out.println("\nExpanded Array: " + Arrays.toString(allNames));
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHow many names do you want to save in the array: ");
        int size = scanner.nextInt();
        String[] names = new String[size];
        System.out.println("Type in " + size + " names please: ");

        names[0] = scanner.nextLine();
        for(int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }

        System.out.print("Expanded Array: ");
        expandArray(names);

    }
}