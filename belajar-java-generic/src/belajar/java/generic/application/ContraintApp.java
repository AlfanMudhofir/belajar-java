package belajar.java.generic.application;

public class ContraintApp {
    public static void main(String[] args) {
        NumberData<Integer> integerNumberData = new NumberData<>(1);
        NumberData<Long> longNumberData = new NumberData<>(2L);

        //NumberData<String> stringNumberData = new NumberData<String>("Data"); //Error karena String bukan turunan Number

        System.out.println(integerNumberData);
        System.out.println(longNumberData);
    }

    public static class NumberData<T extends Number>{
        //Hanya boleh tipe data turunan number
        private T data;

        public NumberData(T data) {
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
