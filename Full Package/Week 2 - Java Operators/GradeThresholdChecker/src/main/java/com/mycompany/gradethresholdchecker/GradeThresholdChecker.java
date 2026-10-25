/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gradethresholdchecker;

/**
 *
 * @author Kylee
 */
public class GradeThresholdChecker {

    public static void main(String[] args) {
         
        System.out.println("========================================");
        System.out.println("          GRADE THRESHOLD CHECKER       ");
        System.out.println("========================================");

        double averageGrade = 88;
        int absences = 2;

        boolean passed = (averageGrade >= 75 && absences <= 3)
                         || (averageGrade >= 90);

        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Number of Absences: " + absences);

        System.out.println("----------------------------------------");

        if (passed) {
            System.out.println("Result: PASS");
            System.out.println("Reason: The student meets the passing requirements.");
        } else {
            System.out.println("Result: FAIL");
            System.out.println("Reason: The student does not meet the passing requirements.");
        }

        // The student passes if the average is at least 75 with no more than
        // 3 absences, OR if the average is at least 90 regardless of absences.
    }
}
