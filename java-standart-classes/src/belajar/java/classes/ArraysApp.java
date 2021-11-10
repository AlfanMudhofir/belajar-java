package belajar.java.classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] number = {1, 2, 8, 5, 9};

        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.binarySearch(number, 8));

        int[] result = Arrays.copyOf(number, 2);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(number, 2, 4);
        System.out.println(Arrays.toString(result2));
    }
}
