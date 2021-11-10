package belajar.java.generic.application;

import belajar.java.generic.MyData;

public class GenericClassApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("Alfan");
        MyData<Integer> integerMyData = new MyData<Integer>(29);

        String stringVal = stringMyData.getData();
        Integer integerVal = integerMyData.getData();

        System.out.println(stringVal);
        System.out.println(integerVal);
    }
}
