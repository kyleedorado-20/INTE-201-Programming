/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.personalprofileprinter;

/**
 *
 * @author Kylee
 */
public class PersonalProfilePrinter {
    public static void main(String[] args) {

        String fullName = "Kylee C. Dorado";
        int age = 19;
        double height = 158;
        char initial = 'K';
        boolean StudentStatus = true;
        
        System.out.println("===== PERSONAL PROFILE =====");
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Initial: " + initial);
        System.out.println("Enrollment Status: " + (StudentStatus ? "Enrolled" : "Not Enrolled"));
    }
}
