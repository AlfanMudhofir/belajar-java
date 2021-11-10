package belajar.java.classes;

public class SystemApp {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.out.println(System.getenv("USERDOMAIN"));

        //Mentrigger Garbage Collection
        System.gc();

        //Keluar dari aplikasi java
        System.exit(0);
    }
}
