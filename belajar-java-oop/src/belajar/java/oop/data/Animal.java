package belajar.java.oop.data;

public abstract class Animal {
    public String name;
    //Apabila menambahkan method, maka hal tersebut akan memaksa turunannya untuk melakukan overide
    public abstract void run();
}
