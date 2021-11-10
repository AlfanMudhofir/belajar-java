package belajar.java.oop.data;

public class Avanza implements Car{
    @Override
    public void drive() {
        System.out.println("Avanza");
    }

    @Override
    public int getTire() {
        return 4;
    }

    public String getBrand(){
        return "Toyota";
    }

    public boolean isMaintenance(){
        return true;
    }
}
