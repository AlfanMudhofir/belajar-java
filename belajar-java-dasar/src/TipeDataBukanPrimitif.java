public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 100L;

        Byte iniByte = null;

        System.out.println(iniByte);

        int iniInt = 100;
        Integer iniInteger2 = iniInt;

        System.out.println(iniInteger2);

        //Merubah ke tipe data yang lain
        short iniShort = iniInteger2.shortValue();
        System.out.println(iniShort);
    }
}
