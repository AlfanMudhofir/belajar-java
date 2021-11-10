package belajar.java.oop.data;

public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Membuat class didalam class
    public class Employee{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        //Mengakses class outer
        public String getCompany(){
            return Company.this.name;
        }
    }
}
