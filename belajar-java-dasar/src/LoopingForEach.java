public class LoopingForEach {
    public static void main(String[] args) {
        int[] array = {
                1, 2, 3, 4, 5
        };

        for (var value: array) {
            System.out.println("Array ke-"+value);
        }
    }
}
