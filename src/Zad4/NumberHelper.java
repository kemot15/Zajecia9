package Zad4;

import java.util.Arrays;

public class NumberHelper {
    public static int reverseNumber (int n){
        int size =0;
        int rest = 0;
        int number = 1;
        int division = 10;
        while(number != 0){
            rest = n % division;
            number = n - rest;
            division *= 10;
            size++;
        }
        int[] reverse = new int[size];
        division = 10;
        number = n;
        for (int i = 0; i < size; i++){
            reverse[i] = (number % division)/(division/10);
            number -= reverse[i];
            division *= 10;
        }
        for (int i = 0; i < size; i++){
            number += reverse[i] * division;
            division /=10;

        }
       // System.out.println(Arrays.toString(number));

       // while (size){

        return n;
    }
}
