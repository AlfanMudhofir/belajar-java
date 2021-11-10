package belajar.java.oop.application;

import belajar.java.oop.data.City;
import belajar.java.oop.data.Location;

public class LocationApp {
    public static void main(String[] args) {
        //var location = new Location(); //Terjadi error karena class bersifat abstract
        var city = new City();
        city.name = "Jakarta";
        System.out.println(city.name);
    }
}
