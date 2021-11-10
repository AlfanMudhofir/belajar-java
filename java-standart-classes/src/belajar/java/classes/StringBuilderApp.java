package belajar.java.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Alfan");
        builder.append(" ");
        builder.append("Mudhofir");

        String name = builder.toString();
        System.out.println(name);
    }
}
