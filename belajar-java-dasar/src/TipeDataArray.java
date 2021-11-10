public class TipeDataArray {
    public static void main(String[] args) {
        String [] arrayString;

        //Harus memasukkan jumlah data bila ingin didefinisikan belakangan
        arrayString = new String[3];
        arrayString[0] = "Mochammad";
        arrayString[1] = "Alfan";
        arrayString[2] = "Mudhofir";

        System.out.println(arrayString[1]);

        //Bisa langsung memasukkan value
        String[] arrayNama = {
                "Mochammad", "Alfan", "Mudhofir"
        };

        int[] arrayInt = new int[]{
                1, 2, 3, 4, 5
        };
        System.out.println("Array ke-2 => "+arrayInt[2]);

        //Mengubah value array
        arrayInt[4] = 6;
        System.out.println("Array ke-4 => "+arrayInt[4]);

        //Mencari panjang
        System.out.println("Panjang array => "+arrayInt.length);

        System.out.println("Panjang array tidak dapat dirubah");

        //Array didalam array
        String[][] members = {
                {
                    "Alfan", "Mudhofir"
                },
                {
                    "Wanda", "Salsabilla"
                }
        };

        System.out.println("Array ke-0 didalam array ke 0 => "+members[0][0]);
    }
}
