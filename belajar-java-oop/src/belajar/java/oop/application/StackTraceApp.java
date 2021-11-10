package belajar.java.oop.application;

public class StackTraceApp {
    public static void main(String[] args) {
        try {
            sampleError();
        } catch (Throwable throwable){
            throwable.printStackTrace();
        }
    }

    public static void sampleError(){
        try {
            String[] name = {
                    "Alfan", "Mudhofir"
            };
            System.out.println(name[2]);
        } catch (Throwable throwable){
            throw new RuntimeException(throwable);
        }
    }
}
