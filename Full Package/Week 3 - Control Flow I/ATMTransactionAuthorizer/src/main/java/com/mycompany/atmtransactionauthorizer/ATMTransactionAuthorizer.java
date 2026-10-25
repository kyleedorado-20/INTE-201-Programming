/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atmtransactionauthorizer;

/**
 *
 * @author Kylee
 */
import java.util.Scanner;
public class ATMTransactionAuthorizer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String correctUsername = "kyleedrd";
        int correctPIN = 1234;
        double balance = 100000.00;

        double withdrawalAmount;
        double dailyLimit;
        double feeRate = 0.0;
        double transactionFee;
        double totalDeduction;
        String accountTier = "";

        System.out.println("====================================");
        System.out.println("       ATM TRANSACTION AUTHORIZER    ");
        System.out.println("====================================\n");

        System.out.print("Enter Username: ");
        String username = input.nextLine();

        if (username.equals(correctUsername)) {
            System.out.print("Enter 4-digit PIN: ");
            int pin = input.nextInt();

            if (pin == correctPIN) {
                System.out.println("\nLogin Successful!");
                System.out.printf("Account Balance: $ %.2f%n", balance);

                // Determine account tier based on balance
                if (balance < 25000) {
                    accountTier = "Regular";
                    dailyLimit = 10000;
                } else if (balance < 75000) {
                    accountTier = "Bronze";
                    dailyLimit = 25000;
                } else if (balance < 200000) {
                    accountTier = "Silver";
                    dailyLimit = 50000;
                } else {
                    accountTier = "Gold";
                    dailyLimit = 100000;
                }

                System.out.println("Account Tier: " + accountTier);
                System.out.printf("Daily Withdrawal Limit: $ %.2f%n",
                        dailyLimit);

                System.out.print("\nEnter Withdrawal Amount: $ ");
                withdrawalAmount = input.nextDouble();

                // Select transaction fee based on account tier
                switch (accountTier) {
                    case "Regular":
                        feeRate = 0.025;
                        break;
                    case "Bronze":
                        feeRate = 0.020;
                        break;
                    case "Silver":
                        feeRate = 0.015;
                        break;
                    case "Gold":
                        feeRate = 0.010;
                        break;
                }

                // Check withdrawal requirements
                if (withdrawalAmount <= 0) {
                    System.out.println("\nTRANSACTION DENIED");
                    System.out.println("Reason: Withdrawal amount must be greater than zero.");

                } else {
                    if (withdrawalAmount <= balance) {
                        if (withdrawalAmount <= dailyLimit) {
                            transactionFee = withdrawalAmount * feeRate;
                            totalDeduction = withdrawalAmount + transactionFee;

                            if (totalDeduction <= balance) {
                                System.out.println("\nTRANSACTION APPROVED");
                                System.out.printf("Withdrawal Amount: $ %.2f%n",
                                        withdrawalAmount);
                                System.out.printf("Transaction Fee: $ %.2f%n",
                                        transactionFee);
                                System.out.printf("Total Deduction: $ %.2f%n",
                                        totalDeduction);

                                balance -= totalDeduction;

                                System.out.printf("Remaining Balance: $ %.2f%n",
                                        balance);
                            } else {
                                System.out.println("\nTRANSACTION DENIED");
                                System.out.println("Reason: Insufficient balance to cover the withdrawal and transaction fee.");
                            }

                        } else {
                            System.out.println("\nTRANSACTION DENIED");
                            System.out.printf(
                                    "Reason: Withdrawal exceeds your %s daily limit of $ %.2f.%n",
                                    accountTier, dailyLimit);
                        }

                    } else {
                        System.out.println("\nTRANSACTION DENIED");
                        System.out.println("Reason: Insufficient balance for the requested withdrawal.");
                    }
                }

            } else {
                System.out.println("\nLogin Failed: Incorrect PIN.");
            }

        } else {
            System.out.println("\nLogin Failed: Incorrect username.");
        }

        System.out.println("\n====================================");
        System.out.println("          THANK YOU FOR USING ATM   ");
        System.out.println("====================================");

        input.close();
    }
}