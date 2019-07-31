package Zad1;

public class MethodExample {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};

        print(tab);
    }

    private static void print (int[] tab){
        for (int i: tab) {
            System.out.println(i);

        }
    }
}
