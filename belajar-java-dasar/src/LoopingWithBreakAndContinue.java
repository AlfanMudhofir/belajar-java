public class LoopingWithBreakAndContinue {
    public static void main(String[] args) {
        var counter = 1;
        while (true){
            System.out.println("Count Number " + counter);
            counter++;
            if (counter>10){
                break;
            }
        }

        System.out.println("Breaking Looping!");

        for(var i = 1; i <= 20; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println("Perulangan ganjil ke-" + i);
        }
    }
}
