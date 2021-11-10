package belajar.java.generic.application;

import belajar.java.generic.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {
        MyData myData = new MyData("Alfan");

        //Terjadi error setelah compile karena dikonversikan
        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer intData = integerMyData.getData();
    }
}
