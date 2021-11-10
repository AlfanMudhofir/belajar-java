public class LoopingFor {
    public static void main(String[] args) {
        var counter = 1;
        for (;counter<=10;){
            System.out.println("Data ke-"+counter);
            counter++;
        }
        System.out.println(counter);

        for (var count = 1; count <= 10; count++){
            System.out.println("Count Number "+count);
        }
    }
}
