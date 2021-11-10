package belajar.java.oop.data;

class SocialMedia {
    String name;
}

//Dengan menggunakan final, maka class tidak dapat diturunkan lagi
final class Facbook extends SocialMedia {
    //final juga dapat digunakan pada method sehingga tidak dapat di override
    final void login(String username, String password){

    }
}
