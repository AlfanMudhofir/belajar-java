package belajar.java.oop.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(
                    new FileReader("README.md")
            );
            while (true){
                String line = reader.readLine();
                if(line == null){
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable throwable) {
            System.out.println("Error membaca file => " + throwable.getMessage());
        } finally {
            if(reader != null){
                try{
                    reader.close();
                    System.out.println("Sukses menutup file");
                } catch (IOException exception){
                    System.out.println("Error menutup resource => " + exception.getMessage());
                }
            }
        }

        //Alternatif membaca file
        try (BufferedReader reader1  = new BufferedReader(new FileReader("README.md"))){
            while (true){
                String line = reader1.readLine();
                if(line == null){
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable throwable) {
            System.out.println("Error membaca file => " + throwable.getMessage());
        }
    }
}
