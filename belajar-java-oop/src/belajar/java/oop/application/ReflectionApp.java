package belajar.java.oop.application;

import belajar.java.oop.data.CreateUserRequest;
import belajar.java.oop.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Alfan");
        request.setPassword("Rahasia");

        ValidationUtil.validationReflection(request);
    }
}
