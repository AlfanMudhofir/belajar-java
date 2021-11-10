public class DataVariable {
    public static void main(String[] args) {
        //Mendeklarasi variable terlebih dahulu
        String name;
        name = "Alfan Mudhofir";

        //Memasukkan value secara langsung
        byte umur = 29;

        System.out.println(name);
        System.out.println(umur);

        //Merubah value dari variable
        name = "Mochammad Alfan Mudhofir";
        System.out.println(name);

        //Variable var hanya bisa dari JAVA 10 ++
        var address = "Purwakarta";
        System.out.println(address);
        //var tidak dapat dideklarasikan variable terlebih dahulu, jadi wajib langsung memasukkan value

        //Variable dengan kata kunci final akan menjadikan variable bersifat Konstanta
        final String kelahiran = "Gresik";
        System.out.println(kelahiran);
    }
}
