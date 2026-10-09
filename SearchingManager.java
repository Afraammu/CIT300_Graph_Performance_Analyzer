
import java.util.Arrays;
import java.util.Scanner;

public class SearchingManager {

    private int[] numbers = new int[100];
    private int size = 0;

    public void addNumbers(Scanner scanner) {
        System.out.print("How many numbers do you want to add? ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input!");
            scanner.next();
            return;
        }

        int count = scanner.nextInt();

        if (count < 1 || count > numbers.length) {
            System.out.println("Enter a number between 1 and 100.");
            return;
        }

        size = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");

            if (scanner.hasNextInt()) {
                numbers[size++] = scanner.nextInt();
            } else {
                System.out.println("Invalid number! Please try again.");
                scanner.next();
                i--;
            }
        }

        System.out.println("Numbers added successfully.");
    }

    public void linearSearch(Scanner scanner) {
        if (size == 0) {
            System.out.println("Please add numbers first.");
            return;
        }

        System.out.print("Enter number to search: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input!");
            scanner.next();
            return;
        }

        int target = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                System.out.println(
                    "Linear Search: Number found at position " + (i + 1)
                );
                return;
            }
        }

        System.out.println("Linear Search: Number not found.");
    }

    public void binarySearch(Scanner scanner) {
        if (size == 0) {
            System.out.println("Please add numbers first.");
            return;
        }

        int[] sorted = Arrays.copyOf(numbers, size);
        Arrays.sort(sorted);

        System.out.println("Sorted numbers: " + Arrays.toString(sorted));
        System.out.print("Enter number to search: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input!");
            scanner.next();
            return;
        }

        int target = scanner.nextInt();
        int result = Arrays.binarySearch(sorted, target);

        if (result >= 0) {
            System.out.println(
                "Binary Search: Number found at sorted position "
                + (result + 1)
            );
        } else {
            System.out.println("Binary Search: Number not found.");
        }
    }

    public void display() {
        if (size == 0) {
            System.out.println("No numbers available.");
            return;
        }

        System.out.println(
            "Numbers: " + Arrays.toString(Arrays.copyOf(numbers, size))
        );
    }

    public void menu(Scanner scanner) {
        int choice = 0;

        do {
            System.out.println("\n--- SEARCHING OPERATIONS ---");
            System.out.println("1. Add Numbers");
            System.out.println("2. Linear Search");
            System.out.println("3. Binary Search");
            System.out.println("4. Display Numbers");
            System.out.println("5. Return to Main Menu");
            System.out.print("Enter choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                scanner.next();
                continue;
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addNumbers(scanner);
                    break;
                case 2:
                    linearSearch(scanner);
                    break;
                case 3:
                    binarySearch(scanner);
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice! Enter 1 to 5.");
            }

        } while (choice != 5);
    }
}