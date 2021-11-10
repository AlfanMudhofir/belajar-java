package belajar.java.oop.data;

public class Cat extends Animal{
    //Harus melakukan override terhadap parentnya
    public void run(){
        System.out.println("Cat " + name + " is running!");
    }
}
