package belajar.java.oop.application;

import belajar.java.oop.data.Avanza;
import belajar.java.oop.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        car.drive();
        System.out.println(car.getTire());
    }
}
