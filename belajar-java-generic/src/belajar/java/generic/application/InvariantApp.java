package belajar.java.generic.application;

import belajar.java.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Alfan");
        // doIt(stringMyData); //Tidak bisa diturunkan
        // MyData<Object> objectMyData = stringMyData; //Ini juga tidak bisa

        MyData<Object> objectMyData = new MyData<>(1000);
        // MyData<Integer> integerMyData = objectMyData; //Tidak bisa juga dinaikkan
    }

    public static void doIt(MyData<Object> objectMyData){
        //Do something
    }
}
