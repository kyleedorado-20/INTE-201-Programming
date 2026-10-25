/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.four.functioncalculator;

/**
 *
 * @author Kylee
 */
import java.util.Scanner;

public class FourFunctionCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("          FOUR-FUNCTION CALCULATOR      ");
        System.out.println("========================================");

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.println("\n=============== RESULTS ===============");

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
            System.out.println("Modulus: " + (num1 % num2));
        } else {
            System.out.println("Division: Cannot divide by zero");
            System.out.println("Modulus: Cannot divide by zero");
        }

        // Division and modulus behave differently with negative operands.
        // Integer division truncates toward zero, and the remainder
        // follows the sign of the dividend (the first number).

        input.close();
    }
}

