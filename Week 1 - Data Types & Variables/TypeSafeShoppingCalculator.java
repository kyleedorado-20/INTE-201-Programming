/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.type.safeshoppingcalculator;

/**
 *
 * @author Kylee
 */
public class TypeSafeShoppingCalculator {

    public static void main(String[] args) {

        // Declare and initialize variables
        String storeName = "KCofi";
        int quantity = 3;
        double unitPrice = 49.50;

        double totalCost = quantity * unitPrice; // totalCost should not be an int because the total may contain decimal values.

        System.out.println("=======================");
        System.out.println("         KCofi         ");
        System.out.println("=======================");
        System.out.println("    PURCHASE SUMMARY   ");
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Cost: " + totalCost);
    }
}
 

