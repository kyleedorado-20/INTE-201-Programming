/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unitcastingconverter;

/**
 *
 * @author Kylee
 */
import java.util.Scanner;
public class UnitCastingConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("           UNIT CASTING CONVERTER       ");
        System.out.println("========================================");

        System.out.print("Enter a length in centimeters: ");
        double centimeters = input.nextDouble();

        int meters = (int) (centimeters / 100);
        double remainingCm = centimeters % 100;

        System.out.println("\nOriginal Length: " + centimeters + " cm");
        System.out.println("Converted Length: " + meters + " m and "
                + remainingCm + " cm");

        System.out.println("\n========================================");
        System.out.println("             IMPLICIT WIDENING          ");
        System.out.println("========================================");

        int wholeNumber = 50;
        double decimalValue = wholeNumber;

        System.out.println("Integer Value: " + wholeNumber);
        System.out.println("Double Value: " + decimalValue);

        // No cast is needed because Java automatically converts int to double.
        // The value 50 is preserved and becomes 50.0.
        
        System.out.println("\n========================================");
        System.out.println("             EXPLICIT NARROWING         ");
        System.out.println("========================================");

        double price = 27.85;
        int wholePrice = (int) price;

        System.out.println("Original Double: " + price);
        System.out.println("Converted Integer: " + wholePrice);

        // Casting double to int removes the fractional part (.85).
        // The value is truncated, not rounded.

        input.close();
    }
}
