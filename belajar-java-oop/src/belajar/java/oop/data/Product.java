package belajar.java.oop.data;

//1 file 1 public class dan haris dideklarasikan sesuai dengan nama file
public class Product {
    public String name;
    public int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    //Membuat method didalam class object (memlakukan overide String)
    public String toString() {
        return "Product name: " + name + ", price: " + price;
    }

    //Melakukan override method equals
//    public boolean equals(Object o){
//        if(o == this){
//            return true;
//        }
//
//        if(!(o instanceof Product)){
//            return false;
//        }
//
//        Product product = (Product) o;
//
//        if(this.price != product.price){
//            return false;
//        }
//
//        if(this.name != null){
//            return this.name.equals(product.name);
//        } else {
//            return product.name == null;
//        }
//    }


    //Melakukan generate equals() dan hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
}
