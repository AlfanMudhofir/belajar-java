package belajar.java.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(" ", "[", "]");
        joiner.add("Alfan");
        joiner.add("Mudhofir");

        String val = joiner.toString();
        System.out.println(val);
    }
}
