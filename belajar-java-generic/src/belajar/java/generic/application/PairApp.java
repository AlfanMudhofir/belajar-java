package belajar.java.generic.application;

import belajar.java.generic.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("Alfan", 10);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
