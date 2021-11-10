package belajar.java.oop.data;

//Melakukan inheritance pada HasBrand
//Melakukan inheritance dari Interface lebih dari 1
public interface Car extends HasBrand, IsMaintenance {
    void drive();
    int getTire();

    //Menambahkan method baru supaya tidak harus dipanggil lagi menggunakan default
    default boolean isBig(){
        return false;
    }
}

//Contoh data interface