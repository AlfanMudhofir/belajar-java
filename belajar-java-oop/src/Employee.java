class Employee {
    String name;

    Employee (String name){
        this.name = name;
    }

    Employee(){}

    void sayHello(String name){
        System.out.println("Hi "+ name +", My Name is "+ this.name+ " and I'm an Employee");
    }
}
