public class KonversiNumber {
    public static void main(String[] args) {
        //Konversi data number ( Widening Casting -> Otomatis & Narrowing Casting -> Manual )
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        //Sample data yang terkena overflow
        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;
    }
}
