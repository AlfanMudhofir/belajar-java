package belajar.java.generic.application;

import belajar.java.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Alfan");
        //Contoh covariant. Hanya bisa read-only
        process(stringMyData);

        MyData<? extends Object> myData = stringMyData;
        System.out.println(myData.getData());
    }

    public static void process(MyData<? extends Object> myData){
        System.out.println(myData.getData());

        //myData.setData("Alfan"); //Tidak dapat merubah data
    }
}
