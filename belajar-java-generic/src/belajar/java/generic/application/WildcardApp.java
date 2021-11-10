package belajar.java.generic.application;

import belajar.java.generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        print(new MyData<>("Hello World!"));
        print(new MyData<>(123));
    }

    public static void print(MyData<?> data){
        System.out.println(data.getData());
    }
}
