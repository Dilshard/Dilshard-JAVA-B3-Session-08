package com.company;

public class Main {

    public static void main(String[] args) {

        Customer cus1 = new Customer();
        cus1.cusName = "Dhayan";
        cus1.cusContact = "0714547547";
        cus1.cusEmail = "dhayan@bitech.lk";
        cus1.basicSalary = 65000;

        cus1.cusPersonal();
        System.out.println("Gross Salary "+cus1.cusSalary());

    }
}
