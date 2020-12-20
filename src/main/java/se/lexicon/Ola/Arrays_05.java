package se.lexicon.Ola;

import java.util.Arrays;
import java.util.Scanner;

/**
 *                       Week2 - Java Arrays - Excersises
 *
 *   5.Create a two-dimensional string array [2][2].
 *     Assign values to the 2d array containing any Country and City.
 *     Expected output: France Paris Sweden Stockholm
 */
public class Arrays_05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a Country: ");
        String country1 = scanner.nextLine();
        System.out.println("Type in the Capital City of that Country: ");
        String capitalCity1 = scanner.nextLine();
        System.out.println("Type in a another Country: ");
        String country2 = scanner.nextLine();
        System.out.println("And the Capital City of that Country: ");
        String capitalCity2 = scanner.nextLine();

        String[][] countryAndCity = new String[2][2];

        countryAndCity[0][0] = country1;
        countryAndCity[0][1] = capitalCity1;
        countryAndCity[1][0] = country2;
        countryAndCity[1][1] = capitalCity2;


        System.out.println("\n");
        System.out.print("In my Capital City array: ");
        for(int row = 0; row < countryAndCity.length; row++){
            for(int column = 0; column < countryAndCity[row].length; column++){
                System.out.print(countryAndCity[row][column] + " ");
            }
        }


    }
}