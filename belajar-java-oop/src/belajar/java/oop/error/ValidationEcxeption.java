package belajar.java.oop.error;

public class ValidationEcxeption extends Throwable {
    //Memanggil message exception
    public ValidationEcxeption(String message){
       super(message);
    }
}
