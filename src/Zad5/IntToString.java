package Zad5;

public class IntToString {
    public static void main(String[] args) {
        int number = 1234;
        String num = Integer.toString(number);
        int [] tab = new int [num.length()];

        for (int i= 0; i < tab.length; i++){
            tab[i] = number % 10;
            number /=10;
        }
        int revert = 0;
        for (int i=0; i < tab.length; i++){
//            revert = revert + tab[i] * (int)Math.pow(10, tab.length - i -1 + revert);
            revert = 10 * revert + tab[i];
        }

    }
}
