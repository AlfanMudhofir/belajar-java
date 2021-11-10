class Manager extends Employee {
    String company;

    Manager(String name){
        super(name);
    }

    Manager(){}

    Manager(String name, String company){
        super(name);
        this.company = company;
    }

    void sayHello(String name){
        System.out.println("Hi "+ name +", My Name is "+ this.name+ " and I'm a Manager");
    }
}


