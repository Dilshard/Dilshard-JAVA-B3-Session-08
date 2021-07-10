package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Customer cus1 = new Customer();
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a basic salary? ");
        cus1.setBasicSalary(scan.nextInt());

        System.out.print("Enter the bonus? ");
        cus1.bonus = scan.nextInt();

        System.out.println(cus1.getBasicSalary());
    }
}
