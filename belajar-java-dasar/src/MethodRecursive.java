public class MethodRecursive {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));
    }

    static int factorialLoop(int value){
        int result = 1;

        for (int counter = 1; counter <= value; counter++){
            result = result * counter;
        }
        return result;
    }

    //Method yang memanggil dirinya sendiri disebut recursive
    static int factorialRecursive(int val){
        if(val==1){
            return 1;
        } else {
            return val * factorialRecursive(val - 1);
        }
    }
}
