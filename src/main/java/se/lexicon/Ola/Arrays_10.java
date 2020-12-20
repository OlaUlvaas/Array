package se.lexicon.Ola;

import java.util.Scanner;

/**
 *                       Week2 - Java Arrays - Excersises
 *
 *   10.Write a program which will represent multiplication table stored in multidimensional array.
 *   Hint: You have two-dimensional array with values [[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]
 */

public class Arrays_10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nMultiplication table 10 x 10: \n");
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print(i + " * " + j + " = " + i * j + " ");
            }
            System.out.println();
        }

    }
}