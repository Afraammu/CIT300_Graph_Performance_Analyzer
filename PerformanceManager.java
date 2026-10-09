
import java.util.Arrays;
import java.util.Scanner;

public class PerformanceManager {

    public void compareSearching(Scanner scanner) {

        System.out.println("\n--- SEARCH PERFORMANCE COMPARISON ---");

        System.out.print("Enter number of elements (1-100000): ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Enter a number.");
            scanner.next();
            return;
        }

        int size = scanner.nextInt();

        if (size < 1 || size > 100000) {
            System.out.println("Please enter a value between 1 and 100000.");
            return;
        }

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = i + 1;
        }

        System.out.print("Enter number to search (1-" + size + "): ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Enter a number.");
            scanner.next();
            return;
        }

        int target = scanner.nextInt();

        long linearSteps = 0;
        long linearStart = System.nanoTime();

        int linearResult = -1;

        for (int i = 0; i < numbers.length; i++) {
            linearSteps++;

            if (numbers[i] == target) {
                linearResult = i;
                break;
            }
        }

        long linearTime = System.nanoTime() - linearStart;

        int[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);

        long binarySteps = 0;
        long binaryStart = System.nanoTime();

        int left = 0;
        int right = sortedNumbers.length - 1;
        int binaryResult = -1;

        while (left <= right) {
            binarySteps++;

            int middle = left + (right - left) / 2;

            if (sortedNumbers[middle] == target) {
                binaryResult = middle;
                break;
            } else if (sortedNumbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        long binaryTime = System.nanoTime() - binaryStart;

        System.out.println("\n========== RESULTS ==========");

        System.out.println("\nLinear Search:");
        System.out.println("Position: " +
            (linearResult == -1 ? "Not found" : linearResult + 1));
        System.out.println("Steps: " + linearSteps);
        System.out.println("Execution time: " + linearTime + " nanoseconds");

        System.out.println("\nBinary Search:");
        System.out.println("Position: " +
            (binaryResult == -1 ? "Not found" : binaryResult + 1));
        System.out.println("Steps: " + binarySteps);
        System.out.println("Execution time: " + binaryTime + " nanoseconds");

        System.out.println("\n========== COMPARISON ==========");

        System.out.println("Linear Search steps: " + linearSteps);
        System.out.println("Binary Search steps: " + binarySteps);

        if (linearSteps < binarySteps) {
            System.out.println("Linear Search used fewer steps for this input.");
        } else if (binarySteps < linearSteps) {
            System.out.println("Binary Search used fewer steps for this input.");
        } else {
            System.out.println("Both searches used the same number of steps.");
        }

        System.out.println(
            "\nNote: Execution time can change between runs. " +
            "Step counts are more useful for comparing this test."
        );
    }

    public void menu(Scanner scanner) {
        int choice = 0;

        do {
            System.out.println("\n--- PERFORMANCE COMPARISON ---");
            System.out.println("1. Compare Linear Search and Binary Search");
            System.out.println("2. Return to Main Menu");
            System.out.print("Enter choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                scanner.next();
                continue;
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    compareSearching(scanner);
                    break;

                case 2:
                    System.out.println("Returning to main menu...");
                    break;

                default:
                    System.out.println("Invalid choice! Enter 1 or 2.");
            }

        } while (choice != 2);
    }
}