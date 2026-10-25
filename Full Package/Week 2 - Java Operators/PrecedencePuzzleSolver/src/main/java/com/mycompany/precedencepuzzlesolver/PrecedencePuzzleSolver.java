/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.precedencepuzzlesolver;

/**
 *
 * @author Kylee
 */
public class PrecedencePuzzleSolver {

    public static void main(String[] args) {

        System.out.println("==============================");
        System.out.println("   Precedence Puzzle Solver   ");
        System.out.println("==============================\n");

        System.out.println("Expression 1: --x * y++ + x");
        System.out.println("x = 6");
        System.out.println("y = 4");

        int x = 6;
        int y = 4;

        // Predicted Result: 25
        int expressionOne = --x * y++ + x;
        System.out.println("Result: " + expressionOne + "\n");
        // The result is 25 because --x decreases x to 5 first.
        // Then 5 * 4 + 5 = 25. The postfix y++ increments y afterward.

        System.out.println("Expression 2: True or False? m % n == 1 && m + n >= 10 || n == 2");
        System.out.println("m = 8");
        System.out.println("n = 3");

        int m = 8;
        int n = 3;

        // Predicted Result: True
        boolean expressionTwo = m % n == 1 && m + n >= 10 || n == 2;
        System.out.println("Result: " + expressionTwo + "\n");
        // The result is false because 8 % 3 == 1 is true,
        // but 8 + 3 >= 10 is also true, so true && true is true.
        // Therefore, the overall result is actually true.

        System.out.println("Expression 3: p++ + 3 * --q - p");
        System.out.println("p = 7");
        System.out.println("q = 5");

        int p = 7;
        int q = 5;

        // Predicted Result: 14
        int expressionThree = p++ + 3 * --q - p;
        System.out.println("Result: " + expressionThree);
        // The result is 13 because --q changes q to 4 first,
        // multiplication gives 12, and p++ uses 7 before p becomes 8.
        // So 7 + 12 - 8 = 11.
    }
}

