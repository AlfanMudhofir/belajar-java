package belajar.java.oop.data;

public class Application {
    public static final int PROCESSOR;
    //Membuat static block
    static {
        System.out.println("Mengakses class Apllication");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
