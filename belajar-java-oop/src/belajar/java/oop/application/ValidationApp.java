package belajar.java.oop.application;

import belajar.java.oop.data.Data;
import belajar.java.oop.error.ValidationEcxeption;
import belajar.java.oop.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        Data loginRequest = new Data(null, null);
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid!");
        } catch (ValidationEcxeption exception){
            System.out.println("Terjadi error => "+ exception.getMessage());
        } catch (NullPointerException exception){
            System.out.println("Terjadi error => "+ exception.getMessage());
        }

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid!");
        } catch (ValidationEcxeption | NullPointerException exception){
            System.out.println("Terjadi error => "+ exception.getMessage());
        } finally {
            System.out.println("Selalu di eksekusi!");
        }

        Data loginRequest2 = new Data(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
    }
}
