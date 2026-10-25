/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nestedloginvalidator;

/**
 *
 * @author Kylee
 */
import java.util.Scanner;

public class NestedLoginValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String correctUsername = "kyleedrd";
        String correctPassword = "12345678";
        boolean accountLocked = false;

        System.out.println("==============================");
        System.out.println("     NESTED LOGIN VALIDATOR   ");
        System.out.println("==============================\n");

        System.out.print("Enter Username: ");
        String username = input.nextLine();

        if (username.equals(correctUsername)) {
            System.out.print("Enter Password: ");
            String password = input.nextLine();

            if (password.equals(correctPassword)) {

                if (!accountLocked) {
                    System.out.println("Login Successful!");
                } else {
                    System.out.println("Login Failed: Account is locked.");
                }

            } else {
                System.out.println("Login Failed: Incorrect password.");
            }

        } else {
            System.out.println("Login Failed: Incorrect username.");
        }

        System.out.println("\n==============================");

        input.close();
    }
}
