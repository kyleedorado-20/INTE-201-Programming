/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simplegradeclassifier;

/**
 *
 * @author Kylee
 */
public class SimpleGradeClassifier {

    public static void main(String[] args) {

        int firstScore = 93;
        int secondScore = 60;
        int thirdScore = 42;

        System.out.println("==============================");
        System.out.println("    Simple Grade Classifier   ");
        System.out.println("==============================\n");

        System.out.println("Student 1 Score: " + firstScore);
        if (firstScore >= 60) {
            System.out.println("Status: PASSED\n");
        } else {
            System.out.println("Status: FAILED\n");
        }

        System.out.println("Student 2 Score: " + secondScore);
        if (secondScore >= 60) {
            System.out.println("Status: PASSED\n");
        } else {
            System.out.println("Status: FAILED\n");
        }

        System.out.println("Student 3 Score: " + thirdScore);
        if (thirdScore >= 60) {
            System.out.println("Status: PASSED");
        } else {
            System.out.println("Status: FAILED");
        }
    }
}