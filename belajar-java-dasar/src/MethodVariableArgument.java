public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] vals = {80, 90, 70 ,65, 100};
        sayCongrats("Bambang",vals);
        sayCongratsArgument("Yanto", 80, 90, 70, 65);
    }

    //Parameter menggunakan array
    static void sayCongrats(String name, int[] values){
        var total = 0;
        for (var val : values){
            total += val;
        }
        var finalVal = total / values.length;

        if(finalVal >= 75){
            System.out.println("Selamat " + name + " Anda Lulus");
        } else {
            System.out.println("Maaf " + name + " Anda Tidak Lulus");
        }
    }

    //Parameter Argument Hanya bisa ditempati di posisi akhir dan berjumlah 1
    static void sayCongratsArgument(String name, int... values){
        var total = 0;
        for (var val : values){
            total += val;
        }
        var finalVal = total / values.length;

        if(finalVal >= 75){
            System.out.println("Selamat " + name + " Anda Lulus");
        } else {
            System.out.println("Maaf " + name + " Anda Tidak Lulus");
        }
    }
}
