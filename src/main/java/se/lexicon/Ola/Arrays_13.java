package se.lexicon.Ola;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
/**
 *                       Week2 - Java Arrays - Excersises
 *
 *   13.Create two arrays with arbitrary size and fill one with random numbers.
 *   Then copy over the numbers from the array with random numbers so that the even numbers are located in the rear
 *   (the right side) part of the array and the odd numbers are located in the front part (the left side).
 *
 *   I'm sorry, I'm not 100% finished with the last one. But it's work ok.
 */
public class Arrays_13 {
    public static void arrayBuilder(){
        Random random = new Random();
        int randomSize = random.nextInt(10)+ 5;
        //System.out.println(randomSize);
        int count = 0;
        int[] randomArray = new int[randomSize];
        int[] evenNumbers = new int[randomSize];
        int[] unevenNumbers = new int[randomSize];
        String[] unEvArray = new String[randomSize];
        String[] evArray = new String[randomSize];
        //String[] finalArray = new String[randomSize];
        for(int i = 0; i < randomArray.length; i++){
            randomArray[i] = random.nextInt(50) + 1;
        }
        System.out.println("\nFirst Array: " + Arrays.toString(randomArray));
        for(int i = 0; i < randomArray.length; i++){
            if(randomArray[i] % 2 == 1){
                unevenNumbers[i] = randomArray[i];
            }
            else if(randomArray[i] % 2 == 0){
                evenNumbers[i] = randomArray[i];
            }
        }
        //System.out.println("Even Array: " + Arrays.toString(evenNumbers));
        //System.out.println("Uneven Array: " + Arrays.toString(unevenNumbers));
        Arrays.sort(evenNumbers);
        Arrays.sort(unevenNumbers);
        for(int i = 0; i < unEvArray.length; i++){
            unEvArray[i] = String.valueOf(unevenNumbers[i]);
        }
        for(int i = 0; i < evArray.length; i++){
            evArray[i] = String.valueOf(evenNumbers[i]);
        }
        //System.out.println(Arrays.toString(unEvArray));
        //System.out.println(Arrays.toString(evArray));
        String[] copy = Arrays.copyOf(unEvArray, unEvArray.length + evArray.length);
        for(int i = unEvArray.length, j = 0; i < copy.length; i++, j++){
            copy[i] = evArray[j];
        }
        //System.out.println(Arrays.toString(copy));
        System.out.print("\nFinal Array: ");
        for(int i = 0; i < copy.length; i++){
            if(!copy[i].equals("0")){
                System.out.print(copy[i] + " ");
            }
        }
        /*for(int i = 0; i < copy.length; i++){
            if(!copy[i].equals("0")){
                finalArray[i] = copy[i];
            }
        }*/
        //System.out.println(Arrays.toString(finalArray));
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Random random = new Random();
        arrayBuilder();
    }
}