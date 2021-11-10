package belajar.java.classes;

public class StringgApp {
    public static void main(String[] args) {
        String name = "Mochammad Alfan Mudhofir";
        String nameToLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameToLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Moch"));
        System.out.println(name.endsWith("Mudhofir"));

        String[] names = name.split(" ");
        for (var val : names){
            System.out.println(val);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println(name.charAt(5));
        char[] chars = name.toCharArray();
        for (var val : chars){
            System.out.println(val);
        }
    }
}
