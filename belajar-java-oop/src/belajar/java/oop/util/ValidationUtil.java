package belajar.java.oop.util;

import belajar.java.oop.annotation.NotBlank;
import belajar.java.oop.data.Data;
import belajar.java.oop.error.BlankException;
import belajar.java.oop.error.ValidationEcxeption;

import java.lang.reflect.Field;

public class ValidationUtil {
    //Checked exception
    public static void validate(Data data) throws ValidationEcxeption, NullPointerException {
        if(data.getUsername() == null){
            throw new NullPointerException("Username is null!");
        } else if(data.getUsername().isBlank()){
            throw new ValidationEcxeption("Username is blank!");
        } else if(data.getPassword() == null){
            throw new NullPointerException("Password is null!");
        } else if(data.getPassword().isBlank()){
            throw new ValidationEcxeption("Password is blank!");
        }
    }

    //Runtime exception
    public static void validateRuntime(Data data) {
        if(data.getUsername() == null){
            throw new NullPointerException("Username is null!");
        } else if(data.getUsername().isBlank()){
            throw new BlankException("Username is blank!");
        } else if(data.getPassword() == null){
            throw new NullPointerException("Password is null!");
        } else if(data.getPassword().isBlank()){
            throw new BlankException("Password is blank!");
        }
    }

    //Validasi menggunakan anotasi reflection
    public static void validationReflection(Object object){
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for(var field : fields){
            field.setAccessible(true);

            if(field.getAnnotation(NotBlank.class) != null){
                //validate
                try{
                    String val = (String) field.get(object);
                    if(val == null || val.isBlank()){
                        throw new BlankException("Field " + field.getName() + " is blank!");
                    }
                } catch (IllegalAccessException exception) {
                    System.out.println("Tidak dapat mengkases field " + field.getName());
                }
            }
        }
    }
}

