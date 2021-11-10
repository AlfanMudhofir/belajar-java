class Parent {
    String name;
    void doIt(){
        System.out.println("Do It From Parent!");
    }
}

class Child extends Parent{
    String name;
    void doIt(){
        System.out.println("Do It From Child!");
    }
}