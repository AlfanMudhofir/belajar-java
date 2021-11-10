package belajar.java.oop.application;
//import digunakan untuk mengakses dari package berbeda (sebagai catatan yang diakses bersifat public)
import belajar.java.oop.data.Product;

//Untuk melakukan pemanggilan semua class dari suatu package, dapat menggunakan tanda (*)
import belajar.java.oop.data.*;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Yamaha Mio S", 16500000);

        System.out.println(product.name);
        System.out.println(product.price);
    }
}
