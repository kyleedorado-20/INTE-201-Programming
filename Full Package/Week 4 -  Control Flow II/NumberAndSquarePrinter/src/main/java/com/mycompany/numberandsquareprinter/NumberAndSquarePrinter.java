/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberandsquareprinter;

/**
 *
 * @author Kylee
 */
public class NumberAndSquarePrinter {

    public static void main(String[] args) {

        System.out.println("==============================");
        System.out.println("     NUMBER & SQUARE PRINTER ");
        System.out.println("==============================");

        System.out.println("\nNumbers 1 to 10:");
        for (int number = 1; number <= 10; number++) {
            System.out.println("Number: " + number
                    + " | Square: " + (number * number));
        }

        System.out.println("\nNumbers 1 to 20:");
        for (int number = 1; number <= 20; number++) {
            System.out.println("Number: " + number
                    + " | Square: " + (number * number));
        }

        System.out.println("==============================");
    }
}
