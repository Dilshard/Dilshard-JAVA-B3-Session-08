package com.company;

public class Customer {

    String cusName;
    String cusEmail;
    String cusContact;
    int bonus;
    private int basicSalary;

    public int getBasicSalary() {
        basicSalary = basicSalary + bonus;
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {

        if(basicSalary >= 15000 && basicSalary <= 100_000){
            this.basicSalary = basicSalary;
        }else {
            System.out.println("Please enter between 15,000 to 100,000!");
        }

    }






    public void cusPersonal(){
        System.out.println("Customer personal details");
        System.out.println("Customer Name "+cusName);
        System.out.println("Customer Email "+cusEmail);
        System.out.println("Customer Contact "+cusContact);
        specialNotice();
    }

    public void specialNotice(){
        System.out.println("Please wear mask inside office premises!");
    }

    private void cusSalary(){

    }


}
