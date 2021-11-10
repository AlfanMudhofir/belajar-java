package belajar.java.oop.application;

import belajar.java.oop.annotation.Fancy;
import belajar.java.oop.data.Animal;
import belajar.java.oop.data.Cat;

@Fancy(name = "AnimalApp", tags = {"app", "java"})
public class AnimalApp {
    @Fancy(name = "Cat")
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Kucing";
        animal.run();
    }
}
