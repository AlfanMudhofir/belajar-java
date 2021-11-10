//Ini adalah class
class Person {
    //Membuat fields didalam class
    String name;
    String address;
    final String country = "Indonesia";

    //Membuat constructor
    Person(String name, String address){
        //Mengatasi variable shadowing menggunakan this keyword
        this.name = name;
        this.address = address;
    }

    //Membuat constructor overloading
    Person(String paramName){
        //Memanggil contructor yang lain
        this(paramName, null);
    }

    Person(){
        this(null);
    }

    //Menambahkan method didalam class
    void sayHello(String paramName){
        System.out.println("Hello "+paramName+"! My name is "+name+".");
    }

    //Menggunakan this untuk memanggil method lain
    void sayHello(){
        this.sayHello("Boss");
    }
}
