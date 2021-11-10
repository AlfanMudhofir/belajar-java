package belajar.java.oop.application;

import belajar.java.oop.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("Alfan", null);
    }

    public static void connectDatabase(String username, String password){
        if(username == null || password == null){
            throw new DatabaseError("Tidak bisa connect database!");
        }
    }
}
