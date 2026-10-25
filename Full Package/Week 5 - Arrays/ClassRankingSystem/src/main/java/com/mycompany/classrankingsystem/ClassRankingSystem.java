/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classrankingsystem;

/**
 *
 * @author Kylee
 */
import java.util.Scanner;
import java.util.Arrays;
public class ClassRankingSystem {

    // Student class containing quiz scores and average
    static class Student {
        String studentName;
        int[] scores;
        double averageScore;

        Student(String studentName, int[] scores) {
            this.studentName = studentName;
            this.scores = scores;

            int total = 0;
            for (int score : scores) {
                total += score;
            }

            averageScore = (double) total / scores.length;
        }
    }

    // Sort students from highest to lowest average
    static void arrangeStudents(Student[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j].averageScore < list[j + 1].averageScore) {
                    Student holder = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = holder;
                }
            }
        }
    }

    // Find the rank of a student using linear search
    static int locateRank(Student[] list, String name) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].studentName.equalsIgnoreCase(name)) {
                int rank = 1;

                for (int j = 0; j < list.length; j++) {
                    if (list[j].averageScore > list[i].averageScore) {
                        rank++;
                    }
                }

                return rank;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String[] studentNames = {
            "Jamilla", "Elle", "Sam", "Ely", "Gerald"
        };

        int[][] quizScores = {
            {88, 90, 85, 92},
            {95, 94, 96, 93},
            {85, 87, 89, 84},
            {95, 94, 96, 93},
            {80, 82, 85, 88}
        };

        // Create student objects from the given data
        Student[] classList = new Student[studentNames.length];

        for (int i = 0; i < classList.length; i++) {
            classList[i] = new Student(studentNames[i], quizScores[i]);
        }

        arrangeStudents(classList);

        // Display the leaderboard
        System.out.println("\n========== STUDENT RANKINGS ==========");
        System.out.printf("%-8s %-12s %-10s %s%n",
                "Rank", "Name", "Average", "Scores");
        System.out.println("--------------------------------------");

        int position = 1;

        for (int i = 0; i < classList.length; i++) {
            if (i > 0 &&
                classList[i].averageScore != classList[i - 1].averageScore) {
                position = i + 1;
            }

            System.out.printf("%-8d %-12s %-10.2f %s%n",
                    position,
                    classList[i].studentName,
                    classList[i].averageScore,
                    Arrays.toString(classList[i].scores));
        }

        // Ask the user which student to search for
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter a student's name: ");
        String searchName = scanner.nextLine();

        int result = locateRank(classList, searchName);

        if (result != -1) {
            System.out.println(searchName + " is ranked number " + result + ".");
        } else {
            System.out.println("No student found with that name.");
        }

        scanner.close();
    }
}
