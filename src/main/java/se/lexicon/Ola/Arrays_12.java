package se.lexicon.Ola;

import java.util.Arrays;
import java.util.Scanner;

/**
 *                       Week2 - Java Arrays - Excersises
 *
 *
 *   12.Write a program which will print the diagonal elements of two-dimensional array. Expected output:1 4 9
 *
 *   I assume you mean we're going to print 1 5 9, so they form a diagonal if we print 1 2 3 on the top row,
 *   4 5 6 in the middle row and 7 8 9 at the bottom row.
 */

public class Arrays_12 {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter a length of a square: ");
        int length = scanner.nextInt();

        squareBuilder(length);
        diagonalFinder(squareBuilder(length), length);

        System.out.println("\nThe square: " + Arrays.deepToString(squareBuilder(length)));
        System.out.print("\nThe diagonal: ");
        for(int element : diagonalFinder(squareBuilder(length), length)){
            System.out.print(element + " ");
        }

    }
    public static int[][] squareBuilder(int length){
        int counter = 1;
        int[][] theSquare = new int[length][length];

        for(int row = 0; row < length; row++){
            for(int column = 0; column < length; column++){
                theSquare[row][column] = counter;
                counter++;
            }
        }
        return theSquare;
    }
    public static int[] diagonalFinder(int[][] theSquare, int length){
        int[] diagonal = new int[length];
        for(int i = 0; i < length; i++){
            diagonal[i] = theSquare[i][i];
        }
        return diagonal;
    }
}