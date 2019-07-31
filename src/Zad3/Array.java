package Zad3;

import java.util.Random;

public class Array {
    public static int[] reverse (int[] array){
        for (int i = 0; i < array.length/2; i++){
            int j = array.length-1-i;
            int endNumber = array[j];
            array[j] = array[i];
            array[i] = endNumber;
        }
        return array;
    }

    public static int[] randomArray (int arraySize, int maxRange){
        Random random = new Random();
        int[] array = new int[arraySize];
        for (int i = 0; i<arraySize; i++ ){
            array[i] = random.nextInt(maxRange);
        }
        return array;
    }

    public static int arrayCount (int[] array, int number){
        int counter = 0;
//        for (int i = 0; i < array.length; i++){
//            if (array[i]==number){
//                counter++;
//            }
//        }
        for ( int i : array)
            if (i==number){
                counter++;
        }
        return counter;
    }
}
