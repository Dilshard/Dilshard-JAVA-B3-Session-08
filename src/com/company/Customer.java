package com.company;

public class Customer {

    String cusName;
    String cusEmail;
    String cusContact;
    int basicSalary;

    public void cusPersonal(){
        System.out.println("Customer personal details");
        System.out.println("Customer Name "+cusName);
        System.out.println("Customer Email "+cusEmail);
        System.out.println("Customer Contact "+cusContact);
        System.out.println("Customer Basic Salary "+basicSalary+"\n");
    }

    public int cusSalary(){
        int grossSalary = basicSalary + 5000;
        return  grossSalary;
    }


}
