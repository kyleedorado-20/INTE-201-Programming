/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.searchandsortminitool;

/**
 *
 * @author Kylee
 */
import java.util.Arrays;
import java.util.Scanner;
public class SearchAndSortMiniTool {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Same scores array from the Class Statistics Calculator
        int[] scores = {82, 95, 73, 88, 91, 79, 86, 68};

        System.out.println("==============================");
        System.out.println("      Search & Sort Mini-Tool");
        System.out.println("==============================");

        System.out.println("Original Scores: " + Arrays.toString(scores));

        // Linear Search
        System.out.print("Enter the score to search: ");
        int target = input.nextInt();

        int index = -1;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Score " + target + " found at index " + index + ".");
        } else {
            System.out.println("Score " + target + " not found.");
        }

        // Sort a copy to keep the original scores in their original order.
        // Sorting the original array would change the indexes of the scores.
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        System.out.println("==============================");
        System.out.println("Original Array: " + Arrays.toString(scores));
        System.out.println("Sorted Array:   " + Arrays.toString(sortedScores));
        System.out.println("==============================");

        input.close();
    }
}

