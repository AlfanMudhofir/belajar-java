//Perubahan satu bentuk menjadi bentuk lain disebut polimorphism, yang diambil adalah parentnya terlebih dahulu
public class PolimorphsmApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Alfan");
        employee.sayHello("Bambang");

        employee = new Manager("Wanda");
        employee.sayHello("Budi");

        employee = new ViceManager("Yanto");
        employee.sayHello("Joko");

        sayHello(new Employee("Alfan"));
        sayHello(new Manager("Joko"));
        sayHello(new ViceManager("Budi"));
    }

    static void sayHello(Employee employee){
        //Pengecekan type cast
        if (employee instanceof ViceManager) {
            //Mengubah instance nya
            ViceManager viceManager = (ViceManager) employee;
            System.out.println("Hello Vice Manager "+viceManager.name);
        } else if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager "+manager.name);
        } else {
            System.out.println("Hello  "+employee.name);
        }
    }
}
