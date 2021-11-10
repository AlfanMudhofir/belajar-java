package belajar.java.classes;

import java.util.StringTokenizer;

public class StrinTokenizerApp {
    public static void main(String[] args) {
        String val = "Alfan Mudhofir";
        StringTokenizer tokenizer = new StringTokenizer(val, " ");

        while(tokenizer.hasMoreTokens()){
            String result = tokenizer.nextToken();
            System.out.println(result);
        }
    }
}
