package se.lexicon.Ola;

import java.util.Arrays;

/**
 *                       Week2 - Java Arrays - Excersises
 *
 *   1.Write a program which will store elements in an array of type 'int' and print it out.
 *     Expected output:11 23 39 etc.
 *
 *   2.Create a program and create a method with name 'indexOf' which will find and return the index
 *     of an element in the array. If the element doesn't exist your method should return -1 as value.
 *     Expected output:Index position of number 5 is: 2.
 *
 *   3.Write a program which will sort string array.
 *     Expected output:String array: [Paris, London, New York, Stockholm]
 *     Sort string array: [London, New York, Paris, Stockholm]
 *
 *   4.Write a program which will copy the elements of one array into another array.
 *     Expected output:Elements from first array: 1 15 20 Elements from second array: 1 15 20
 *
 *   5.Create a two-dimensional string array [2][2].
 *     Assign values to the 2d array containing any Country and City.
 *     Expected output: France Paris Sweden Stockholm
 *
 *   6.Write a program which will set up an array to hold the next values in this order: 43, 5, 23, 17, 2, 14
 *     and print the average of these 6 numbers.Expected output:Average is: 17.3
 *
 *   7.Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
 *     Expected output:Array: 1 2 4 7 912Odd Array: 1 7 9
 *
 *   8.Write a program which will remove the duplicate elements of a given array
 *     [20, 20, 40, 20, 30, 40, 50, 60, 50].
 *     Expected output:Array: 20 20 40 20 30 40 50 60 50 Array without duplicate values: 20 40 30 50 60
 *
 *   9.Write a method which will add elements in an array.
 *     Remember that arrays are fixed in size so you need to come up with a solution to "expand" the array.
 *
 *   10.Write a program which will represent multiplication table stored in multidimensional array.
 *   Hint: You have two-dimensional array with values [[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]
 *
 *   11.Write a program that ask the user for an integer and repeat that question until user give
 *   you a specific value that user already has been told about as a message in your program.
 *   Store these values in an array and print that array. After that reverse the array elements so that
 *   the first element becomes the last element, the second element becomes the second to last element, etc.
 *   Do not just reverse the orderin which they are printed.
 *   You need to change the way they are stored in the array.
 *
 *   12.Write a program which will print the diagonal elements of two-dimensional array. Expected output:1 4 9
 *
 *   13.Create two arrays with arbitrary size and fill one with random numbers.
 *   Then copy over the numbers from the array with random numbers so that the even numbers are located in the rear
 *   (the right side) part of the array and the odd numbers are located in the front part (the left side).
 */
public class App
{

    public static void main( String[] args )
    {
        System.out.println("Hej");

        /*ARRAYS - CASE_INSENSITIVE_ORDER
        String[] names = {"Börje", "Pelle", "anders", "Ulf", "Tessan"};
        //Arrays.sort(names);
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        for(String name : names){
            System.out.println(name);
        }*/


        /*ARRAYS - BINARY_SEARCH
        int[] numbers = {540, 80, 1150, 8850, 2450, 900, 8000, 10};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int indexFound = Arrays.binarySearch(numbers,80);
        int indexNotFound = Arrays.binarySearch(numbers,8800);
        System.out.println(indexFound);
        System.out.println(indexNotFound);*/

        /*ARRAYS - COPY_OF
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = Arrays.copyOf(array1, 3);
        //System.out.println(Arrays.toString(array2));
        for (int number : array2){
            System.out.println(number);
        }
        int[] arr1 = {10, 20, 30};
        int[] arr2 = Arrays.copyOf(arr1, arr1.length + 2);
        arr2[3] = 40;
        arr2[4] = 50;
        System.out.println(Arrays.toString(arr2));*/

        /*ARRAYS - COPY_VS_REFERENCE
        char[] letters = {'J','a','v','a'};
        //Making a reference that points to letters
        char[] notACopy = letters;
        //Making a real new array that is a copy of letters
        char[] realCopy = Arrays.copyOf(letters, letters.length);
        letters[0] = 'L';
        System.out.println(Arrays.toString(notACopy));
        System.out.println(Arrays.toString(realCopy));*/

        /*ARRAYS - EXPANDABLE
        String[] names = new String[0];
        String[] newArray = Arrays.copyOf(names, names.length + 1);
        newArray[0] = "Fredrik";
        System.out.println(Arrays.toString(newArray));
        for(String name : newArray){
            System.out.println(name);
        }*/
        /*ARRAYS - COMBINED
        String[] namesOne = {"Benny", "Kalle", "Lotta"};
        String[] namesTwo = {"Jessica", "Magnus", "Britt", "Hans"};
        String[] combined = Arrays.copyOf(namesOne, namesOne.length + namesTwo.length);
        for(int i = namesOne.length, j = 0; i < combined.length; i++, j++){
            combined[i] = namesTwo[j];
        }
        System.out.println(Arrays.toString(combined));*/


        /*ARRAYS - COPY_OF_RANGE
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int startIndex = 2;
        int endIndex = numbers.length;
        int[] range = Arrays.copyOfRange(numbers, startIndex, endIndex);
        System.out.println(Arrays.toString(range));*/


        /*ARRAYS - FILL
        char[] letters = new char[10];
        Arrays.fill(letters, 'X');
        System.out.println(Arrays.toString(letters));*/

        /*LOCAL_VARIABLES_AND_OBJECTS
        int result = 0;
        for(int i = 0; i < 5; i++){
            result = result + i;
        }
        System.out.println(result);
        //System.out.println(i); compile error!*/
        //int result = 0;


        /*FIELDS_AND_INTERNAL_SCOPES
        FOR_THE_APP_CLASS
        public int number = 0;
        private static int number2 = 0;
        public void print(){
        int number = 2;
        System.out.println("Field: " + this.number + " LocalVariable: " + number);
        }
        public static void staticPrint(){
        int number2 = 2;
        System.out.println("Field: " + App.number2 + " LocalVariable: " + number2);
        }
        FOR_MAIN_METHOD
        staticPrint()        */

    }

}