package belajar.java.oop.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Lenovo Thinkpad", 7500000);
        System.out.println(product.name);
        System.out.println(product.price);

        //Melakukan overide representasi String product
        System.out.println(product);

        Product product2 = new Product("Lenovo Thinkpad", 7500000);

        System.out.println(product.equals(product2));
        System.out.println(product.hashCode() == product2.hashCode());
    }
}
