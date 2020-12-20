package se.lexicon.Ola;

import java.util.Arrays;
import java.util.Scanner;

/**
 *                       Week2 - Java Arrays - Excersises
 *
 *   11.Write a program that ask the user for an integer and repeat that question until user give
 *   you a specific value that user already has been told about as a message in your program.
 *   Store these values in an array and print that array. After that reverse the array elements so that
 *   the first element becomes the last element, the second element becomes the second to last element, etc.
 *   Do not just reverse the order in which they are printed.
 *   You need to change the way they are stored in the array.
 */

public class Arrays_11 {
    public static int[] numberArray(int[] numbers) {
        int[] dubbelNumbers = new int[numbers.length * 2];
        dubbelNumbers = Arrays.copyOfRange(numbers, 0, numbers.length + 1);
        return dubbelNumbers;
    }

    public static int[] trashArray(int[] trash) {
        int[] dubbelTrash = new int[trash.length * 2];
        dubbelTrash = Arrays.copyOfRange(trash, 0, trash.length + 1);
        return dubbelTrash;
    }

    public static int[] copyArray(int[] copy) {
        int[] dubbelCopy = new int[copy.length * 2];
        dubbelCopy = Arrays.copyOfRange(copy, 0, copy.length + 1);
        return dubbelCopy;
    }

    public static int[] numArray(int[] numbers) {
        int[] newArray = new int[numbers.length - 2];
        newArray = Arrays.copyOfRange(numbers, 2, numbers.length);
        return newArray;
    }

    public static int[] reverseArray(int[] numbers) {
        int temp;
        int[] newArray = new int[numbers.length - 2];
        for (int i = 0; i < numbers.length / 2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        newArray = Arrays.copyOfRange(numbers, 0, numbers.length - 2);
        return newArray;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int input = 0;
        boolean on = true;
        int[] trash = new int[count + 1];
        int[] numbers = new int[count + 1];
        int[] copy = new int[count + 1];


        do {
            System.out.println("Enter a number: ");
            input = scanner.nextInt();
            numbers[count] = input;

            if (numbers.length == count + 1) {
                numbers = numberArray(numbers);
                trash = trashArray(trash);
                copy = copyArray(copy);
            }
            Arrays.sort(numbers, 0, numbers.length - 1);

            if (numbers.length > 1) {
                for (int i = 0; i < numbers.length - 1; i++) {
                    if (numbers[i] == numbers[i + 1]) {
                        trash[i] = numbers[i];
                        numbers[i] = -1;
                        System.out.println("\nOps, that number already exists in the array.");
                        on = false;
                    } else {
                        copy[i] = numbers[i];
                    }
                }
            }
            count++;

        } while (on);

        Arrays.sort(numbers);
        System.out.println("\nNormal Array: " + Arrays.toString(numArray(numbers)));


        System.out.println("\nReversed Array: " + Arrays.toString(reverseArray(numbers)));
    }
}