package belajar.java.generic.application;

import belajar.java.generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Mochammad", "Alfan", "Mudhofir"};
        Integer[] numbers = {1, 2, 3, 4, 5};

        System.out.println(
                //Bisa dideklarasikan tipe datanya
                ArrayHelper.<String>count(names)
        );
        System.out.println(
                //Bisa tidak dimasukkan
                ArrayHelper.count(numbers)
        );
    }
}
