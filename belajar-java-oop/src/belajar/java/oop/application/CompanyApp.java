package belajar.java.oop.application;

import belajar.java.oop.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Nutech Integrasi");

        //Memanggil inner class
        Company.Employee employee = company.new Employee();
        employee.setName("Alfan");

        System.out.println(employee.getCompany());
        System.out.println(employee.getName());
    }
}
