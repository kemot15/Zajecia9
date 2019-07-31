package Zad3;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] tab = Array.randomArray(10, 10);
        tab = Array.reverse(tab);
        System.out.println(Array.arrayCount(tab, 3));
        System.out.println(Arrays.toString(tab));
    }
}
