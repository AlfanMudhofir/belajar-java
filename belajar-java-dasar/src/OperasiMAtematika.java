public class OperasiMAtematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println("a + b = "+ (a+b));
        System.out.println("a - b = "+ (a-b));
        System.out.println("a * b = "+ (a*b));
        System.out.println("a / b = "+ (a/b));
        System.out.println("a % b = "+ (a%b));

        //Augmented Assignmnet
        int c = a;
        System.out.println(c+=10);
        System.out.println(c-=10);
        System.out.println(c*=10);
        System.out.println(c/=10);
        System.out.println(c%=10);

        //Unary operator
        int d = b;
        d++;
        System.out.println(d);
        d--;
        System.out.println(d);
        System.out.println(-d);
        System.out.println(+d);
        System.out.println(!true);
    }
}
