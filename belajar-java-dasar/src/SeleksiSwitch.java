public class SeleksiSwitch {
    public static void main(String[] args) {
        var nilai = 'F';

        switch (nilai) {
            case 'A':
                System.out.println("Lulus Dengan Baik");
                break;
            case 'B':
            case 'C':
                System.out.println("Lumayanlah!");
                break;
            case 'D':
                System.out.println("Tidak Lulus");
                break;
            default:
                System.out.println("Salah Jurusan Kayaknya!");
        }
    }
}
