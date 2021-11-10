package belajar.java.oop.util;

public class MathUtil {
    public static int sum(int... val){
        int total = 0;
        for(var value : val){
            total += value;
        }
        return total;
    }
}
