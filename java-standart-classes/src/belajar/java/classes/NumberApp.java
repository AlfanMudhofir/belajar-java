package belajar.java.classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer intVal = 10;
        Long longVal = intVal.longValue();
        Double doubleVal = longVal.doubleValue();
        Short shortVal = doubleVal.shortValue();

        String contoh = "10000.15";
        Double contohInteger = Double.valueOf(contoh);
        System.out.println(contohInteger);
    }
}
