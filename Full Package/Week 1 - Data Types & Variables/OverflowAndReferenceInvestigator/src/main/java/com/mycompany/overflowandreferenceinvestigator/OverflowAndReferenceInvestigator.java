/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.overflowandreferenceinvestigator;

/**
 *
 * @author Kylee
 */
public class OverflowAndReferenceInvestigator {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("          PRIMITIVE TYPE OVERFLOW       ");
        System.out.println("========================================");

        byte number = 127;
        System.out.println("Byte Before Increment: " + number);

        number++;
        System.out.println("Byte After Increment: " + number);

        // A byte can store values from -128 to 127.
        // Incrementing 127 causes overflow, resulting in -128.

        System.out.println("\n========================================");
        System.out.println("          STRING REFERENCE TEST         ");
        System.out.println("========================================");

        String A = new String("Hello Java");
        String B = new String("Hello Java");
        String C = "Hello Java";

        System.out.println("A == B: " + (A == B));
        // False because A and B refer to separate objects in memory.

        System.out.println("A equals B: " + A.equals(B));
        // True because both objects contain the same text.

        System.out.println("A == C: " + (A == C));
        // False because A refers to a new object, while C refers to a string literal.

        System.out.println("A equals C: " + A.equals(C));
        // True because both strings contain the same text.

        System.out.println("B == C: " + (B == C));
        // False because B and C refer to different objects.

        System.out.println("B equals C: " + B.equals(C));
        // True because both strings contain the same characters.

        System.out.println("\n========================================");
        System.out.println("           SHARED ARRAY TEST            ");
        System.out.println("========================================");

        int[] originalArray = {10, 20, 30};
        int[] sharedArray = originalArray;

        System.out.println("Original First Element: " + originalArray[0]);

        sharedArray[0] = 99;

        System.out.println("Modified Through Shared Array: " + sharedArray[0]);
        System.out.println("Original Array After Modification: " + originalArray[0]);

        // Both variables refer to the same array object.
        // Changes through sharedArray are visible through originalArray.

    }
}