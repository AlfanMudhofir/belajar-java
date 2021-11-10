package belajar.java.generic.application;

import belajar.java.generic.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Alimin", "Depok"),
                new Person("Alfan", "Purwakarta"),
                new Person("Ari", "Cikampek")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
