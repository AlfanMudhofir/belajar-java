package belajar.java.oop.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Alfan";
        first = first + " Mudhofir";

        System.out.println(first);

        String second = "Alfan Mudhofir";
        System.out.println(second);

        String third = "Alfan Mudhofir";
        System.out.println(third);

        System.out.println("first == second => "+ (first == second));
        //Pada dasarnya java melakukan optimasi memory, jadi bila ada value yang sama maka akan disimpan
        // ditempat yang sama
        System.out.println("second == third => "+ (second == third));

        System.out.println("first.equals(second) => "+ first.equals(second));
    }
}
