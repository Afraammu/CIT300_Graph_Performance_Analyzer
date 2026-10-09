
import java.util.Scanner;

public class ArrayManager {

    private int[] numbers = new int[100];
    private int size = 0;
    private Scanner scanner = new Scanner(System.in);

    public void insert() {
        if (size == numbers.length) {
            System.out.println("Array is full!");
            return;
        }

        System.out.print("Enter number to insert: ");
        int value = scanner.nextInt();

        numbers[size] = value;
        size++;

        System.out.println("Number inserted successfully.");
    }

    public void delete() {
        System.out.print("Enter number to delete: ");
        int value = scanner.nextInt();

        int index = searchIndex(value);

        if (index == -1) {
            System.out.println("Number not found.");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        size--;
        System.out.println("Number deleted successfully.");
    }

    public void search() {
        System.out.print("Enter number to search: ");
        int value = scanner.nextInt();

        int index = searchIndex(value);

        if (index == -1) {
            System.out.println("Number not found.");
        } else {
            System.out.println("Number found at position: " + (index + 1));
        }
    }

    private int searchIndex(int value) {
        for (int i = 0; i < size; i++) {
            if (numbers[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.print("Array elements: ");

        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
    }

    public void menu() {
        int choice;

        do {
            System.out.println("\n--- ARRAY OPERATIONS ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }
}