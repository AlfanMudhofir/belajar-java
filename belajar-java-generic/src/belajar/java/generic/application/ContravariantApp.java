package belajar.java.generic.application;

import belajar.java.generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Alfan");
        MyData<? super String> myData = objectMyData;

        process(objectMyData);

        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String> myData) {
        myData.setData("Alfan Mudhofir");

        //Pada dasarnya tidak dapat mengambil data, tapi kita bisa memaksakan dengan mengkonversi data
        //Data yang dikirim bertipe object sehingga cukup berbahaya
        String val = (String) myData.getData();
        System.out.println("Proses parameter => "+val);
    }
}
