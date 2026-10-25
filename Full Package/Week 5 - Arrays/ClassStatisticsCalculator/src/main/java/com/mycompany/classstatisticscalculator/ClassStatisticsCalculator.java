/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classstatisticscalculator;

/**
 *
 * @author Kylee
 */
public class ClassStatisticsCalculator {

    public static void main(String[] args) {

        int[] scores = {82, 95, 73, 88, 91, 79, 86, 68};

        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];
        double average;

        System.out.println("==============================");
        System.out.println("   Class Statistics Calculator");
        System.out.println("==============================");

        System.out.println("Student Scores:");

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + scores[i]);

            sum += scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        average = (double) sum / scores.length;

        System.out.println("==============================");
        System.out.println("Total Sum: " + sum);
        System.out.printf("Average Score: %.2f%n", average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("==============================");
    }
}
