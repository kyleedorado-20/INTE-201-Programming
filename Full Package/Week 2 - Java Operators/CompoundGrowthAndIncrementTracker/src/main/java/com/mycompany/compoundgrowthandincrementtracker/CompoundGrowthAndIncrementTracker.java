/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.compoundgrowthandincrementtracker;

/**
 *
 * @author Kylee
 */
public class CompoundGrowthAndIncrementTracker {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("      COMPOUND GROWTH TRACKER           ");
        System.out.println("========================================");

        double balance = 1000.00;

        System.out.println("Initial Balance         : $" + balance);

        balance += 200;
        System.out.println("After $200 Deposit (+=) : $" + balance);

        balance *= 1.10;
        System.out.println("After 10% Interest (*=) : $" + balance);

        balance += 300;
        System.out.println("After $300 Deposit (+=) : $" + balance);

        System.out.println("\n========================================");
        System.out.println("            INCREMENT TRACKER           ");
        System.out.println("========================================");

        int count = 5;

        System.out.println("Postfix Result: " + count++);
        System.out.println("Count After Postfix: " + count);
        // Postfix (count++) prints the current value before incrementing it.

        System.out.println("Prefix Result: " + (++count));
        System.out.println("Count After Prefix: " + count);
        // Prefix (++count) increments the value first, then prints it.
        // Therefore, postfix displays the old value, while prefix displays the updated value.

    }
}
