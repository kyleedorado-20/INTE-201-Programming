/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multi.tierdiscountsystem;

/**
 *
 * @author Kylee
 */
public class MultiTierDiscountSystem {

    public static void main(String[] args) {

        double purchaseAmount = 3500.00;
        double discountRate;
        double discountAmount;
        double finalPrice;
        String discountTier;

        System.out.println("==============================");
        System.out.println("   MULTI-TIER DISCOUNT SYSTEM");
        System.out.println("==============================\n");

        System.out.println("Purchase Amount: PHP " + purchaseAmount);

        if (purchaseAmount < 1000) {
            discountRate = 0.00;
            discountTier = "Basic Tier (0%)";
        } else if (purchaseAmount < 2000) {
            discountRate = 0.05;
            discountTier = "Standard Tier (5%)";
        } else if (purchaseAmount < 3000) {
            discountRate = 0.10;
            discountTier = "Premium Tier (10%)";
        } else {
            discountRate = 0.15;
            discountTier = "VIP Tier (15%)";
        }

        discountAmount = purchaseAmount * discountRate;
        finalPrice = purchaseAmount - discountAmount;

        System.out.println("Discount Tier: " + discountTier);
        System.out.println("Discount Amount: PHP "
                + String.format("%.2f", discountAmount));
        System.out.println("Final Discounted Price: PHP "
                + String.format("%.2f", finalPrice));

        System.out.println("==============================");
    }
}
