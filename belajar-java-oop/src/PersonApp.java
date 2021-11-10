public class PersonApp {
    public static void main(String[] args) {
        //Cara membuat object dari class Person.class
        var person1 = new Person();
        person1.name = "Alfan";
        person1.address = "Purwakarta";

        System.out.println(person1.name+" "+person1.address+" "+person1.country);
        person1.sayHello("Bambang");

        Person person2 = new Person("Yanto", "Bandung");
        person2.sayHello();

        Person person3;
        person3 = new Person("Joko");
        person3.sayHello("Budi");
    }
}
