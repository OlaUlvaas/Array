package se.lexicon.Ola;



import java.util.Arrays;
import java.util.Scanner;

/**
 *                       Week2 - Java Arrays - Excersises
 *
 *
 *   2.Create a program and create a method with name 'indexOf' which will find and return the index
 *     of an element in the array. If the element doesn't exist your method should return -1 as value.
 *     Expected output:Index position of number 5 is: 2.
 */
public class Arrays_02 {
    public static boolean ok = false;
    public static int indexOf(int[] array, int value){

        int index = 0;

        for(int i = 0; i < array.length;i++){
            if(array[i] == value){
                index = i;
                ok = true;
            }
        }
        return index;


    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter the length of the array: ");
        int arrayLength = scanner.nextInt();
        // Build the array and
        int[] numbers = new int[arrayLength];
        System.out.println("\nPlease fill the array with " + arrayLength + " integers: ");
        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("\nMy array is filled with: " + Arrays.toString(numbers));
        System.out.println("\nWhat number do you want to check if it is in the array?: ");
        int number = scanner.nextInt();

        int index = indexOf(numbers, number);

        if(ok){
            System.out.println("\nThe index of number " + number + " is: " + index + ".");
        }
        else{
            System.out.println("\nThe index of number " + number + " is: -1.");
        }




    }

}