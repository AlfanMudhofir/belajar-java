package belajar.java.classes;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String origin = "Alfan Mudhofir";
        String encode = Base64.getEncoder().encodeToString(origin.getBytes());
        System.out.println(encode);

        byte[] bytes = Base64.getDecoder().decode(encode);
        String res = new String(bytes);
        System.out.println(res);
    }
}
