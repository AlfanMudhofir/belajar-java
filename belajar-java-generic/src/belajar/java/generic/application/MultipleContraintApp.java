package belajar.java.generic.application;

public class MultipleContraintApp {
    public static void main(String[] args) {
        //Data<Manager> managerData = new Data<>(new Manager());
        // Error karena Manager tidak melakukan Override CanSayHello
        Data<ViceManager> viceManagerData = new Data<>(new ViceManager());
    }

    public static abstract class Employee {

    }

    public static class Manager extends Employee {

    }

    public static class ViceManager extends Employee implements CanSayHello {
        @Override
        public void sayHello(String name) {
            System.out.println("Hello " + name);
        }
    }

    public static interface CanSayHello {
        void sayHello(String name);
    }

    public static class Data<T extends Employee & CanSayHello>{
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
