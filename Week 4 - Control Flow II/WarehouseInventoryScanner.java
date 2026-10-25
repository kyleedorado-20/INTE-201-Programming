/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.warehouseinventoryscanner;

/**
 *
 * @author Kylee
 */
import java.util.Scanner;
public class WarehouseInventoryScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] shelves = {
            {32, 7, 14, -1, 21},
            {5, 26, -1, 18, 8},
            {40, 12, 6, 35, -1}
        };

        int menuChoice;

        do {
            System.out.println("==============================");
            System.out.println("    Warehouse Inventory System    ");
            System.out.println("==============================");
            System.out.println("[1] Display Inventory");
            System.out.println("[2] Find Low Stock");
            System.out.println("[3] Calculate Total Inventory");
            System.out.println("[4] Restock a Shelf");
            System.out.println("[5] Close Program");
            System.out.print("\nSelect an option: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Error: Enter a valid number.");
                scanner.next();
                System.out.print("Select an option: ");
            }

            menuChoice = scanner.nextInt();

            switch (menuChoice) {
                case 1:
                    printShelves(shelves);
                    break;

                case 2:
                    findLowStock(shelves);
                    break;

                case 3:
                    countItems(shelves);
                    break;

                case 4:
                    updateStock(shelves, scanner);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.out.println("Warehouse System Closed.");
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid Choice: Select from 1 to 5.");
            }

        } while (menuChoice != 5);

        scanner.close();
    }

    public static void printShelves(int[][] shelves) {
        System.out.println("\n=== Warehouse Inventory Records ===");

        for (int row = 0; row < shelves.length; row++) {
            for (int col = 0; col < shelves[row].length; col++) {
                if (shelves[row][col] == -1) {
                    System.out.print("X\t");
                } else {
                    System.out.print(shelves[row][col] + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void findLowStock(int[][] shelves) {
        int minimumStock = 10;
        boolean lowStockFound = false;

        System.out.println("\n=== Checking Inventory Stock Levels ===");

        for (int row = 0; row < shelves.length && !lowStockFound; row++) {
            for (int col = 0; col < shelves[row].length; col++) {
                if (shelves[row][col] == -1) {
                    continue; // CONTINUE: Skip damaged shelves.
                }

                if (shelves[row][col] < minimumStock) {
                    System.out.println("Low Stock Detected at Row " + row
                            + ", Column " + col
                            + " (Available Items: " + shelves[row][col] + ")");
                    lowStockFound = true;
                    break; // BREAK: Stop after finding the first low-stock shelf.
                }
            }
        }

        if (!lowStockFound) {
            System.out.println("No Low Stock Shelves Found.");
        }
    }

    public static void countItems(int[][] shelves) {
        int itemCount = 0;

        System.out.println("\n=== Warehouse Inventory Summary ===");

        for (int row = 0; row < shelves.length; row++) {
            for (int col = 0; col < shelves[row].length; col++) {
                if (shelves[row][col] == -1) {
                    continue; // CONTINUE: Ignore damaged shelves.
                }

                itemCount += shelves[row][col];
            }
        }

        System.out.println("Total Available Items: " + itemCount);
    }

    public static void updateStock(int[][] shelves, Scanner scanner) {
        System.out.println("\n=== Inventory Restocking ===");

        int selectedRow = getInteger(scanner, "Enter Row index (0-2): ");
        int selectedCol = getInteger(scanner, "Enter Column index (0-4): ");

        if (selectedRow < 0 || selectedRow >= shelves.length
                || selectedCol < 0
                || selectedCol >= shelves[0].length) {
            System.out.println("Error: Shelf position does not exist.");
            return; // RETURN: Exit if the location is invalid.
        }

        if (shelves[selectedRow][selectedCol] == -1) {
            System.out.println("Error: This shelf is damaged and cannot be restocked.");
            return; // RETURN: Exit if the shelf is damaged.
        }

        int addedItems = 0;

        while (addedItems <= 0) {
            addedItems = getInteger(scanner,
                    "Enter quantity to add (greater than 0): ");

            if (addedItems <= 0) {
                System.out.println("Error: Quantity must be greater than zero.");
            }
        }

        shelves[selectedRow][selectedCol] += addedItems;

        System.out.println("Success: Added " + addedItems
                + " items. Updated stock is "
                + shelves[selectedRow][selectedCol] + ".");
    }

    public static int getInteger(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);

            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }

            System.out.println("Error: Please enter a whole number.");
            scanner.next();
        }
    }
}
