package belajar.java.oop.application;

import belajar.java.oop.data.Customer;
import belajar.java.oop.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Alfan");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDesc());

        //Mengubah enum menjadi String
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("STANDART");
        System.out.println(level);

        Level[] levels = Level.values();
        for(var val : levels){
            System.out.println(val);
        }
    }
}
