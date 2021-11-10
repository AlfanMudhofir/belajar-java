public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Bambang");
        sayHello("Yanto", "Bandung");
    }

    static void sayHello(){
        System.out.println("Hello!");
    }

    static void sayHello(String name){
        System.out.println("Hello "+ name +"!");
    }

    static void sayHello(String fullname, String region){
        System.out.println("Hello "+ fullname + " From "+region);
    }
}
