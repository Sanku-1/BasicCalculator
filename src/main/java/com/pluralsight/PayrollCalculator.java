package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner payrollScanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String nameProvided = payrollScanner.nextLine();
        System.out.print("Enter your hours worked: ");
        Float hoursWorked = payrollScanner.nextFloat();
        System.out.print("Enter your pay rate: ");
        Float payRate = payrollScanner.nextFloat();
        Float grossPay = hoursWorked * payRate;
        System.out.println("The gross pay for " + nameProvided + " is $" + grossPay);
    }
}
