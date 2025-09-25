package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner calculatorScanner = new Scanner(System.in);
        System.out.print("Please enter the first number you wish to multiply: ");
        float firstNumber = calculatorScanner.nextFloat();
        System.out.print("Please enter the second number you wish to multiply: ");
        float secondNumber = calculatorScanner.nextFloat();
        float productMultiplication = firstNumber * secondNumber;
        System.out.print("The product of multiplying "+ firstNumber + " and " + secondNumber + " is " + productMultiplication);
    }
}
