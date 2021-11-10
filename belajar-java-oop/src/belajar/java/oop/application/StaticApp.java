package belajar.java.oop.application;

import belajar.java.oop.data.Country;
import belajar.java.oop.util.MathUtil;
//Membuat static import
import static belajar.java.oop.data.Application.PROCESSOR;
import static belajar.java.oop.data.Constant.*;

public class StaticApp {
    public static void main(String[] args) {
        //Mengakses static value
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(1, 5, 9, 5, 7));

        Country.City city = new Country.City();
        city.setName("Purwakarta");
        System.out.println(city.getName());

        System.out.println(PROCESSOR);
    }
}
