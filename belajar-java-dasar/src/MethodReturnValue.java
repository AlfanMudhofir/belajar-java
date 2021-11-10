public class MethodReturnValue {
    public static void main(String[] args) {
        var a = 100;
        var b = 10;
        var c = sum(a, b);

        System.out.println("Result => " + c);
    }

    //bila mengunakan return, hanya bisa 1 tipe data. Hingga tidak dapat menggunakan void.
    static int sum(int val1, int val2){
        var total = val1 + val2;
        return total;
    }
}
