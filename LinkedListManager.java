
import java.util.Scanner;

public class LinkedListManager {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;

    public void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        System.out.println(value + " inserted successfully.");
    }

    public void delete(int value) {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        if (head.data == value) {
            head = head.next;
            System.out.println(value + " deleted successfully.");
            return;
        }

        Node current = head;

        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Value not found.");
        } else {
            current.next = current.next.next;
            System.out.println(value + " deleted successfully.");
        }
    }

    public void search(int value) {
        Node current = head;
        int position = 1;

        while (current != null) {
            if (current.data == value) {
                System.out.println(
                    value + " found at position " + position
                );
                return;
            }

            current = current.next;
            position++;
        }

        System.out.println("Value not found.");
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        Node current = head;
        System.out.print("Linked List: ");

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("NULL");
    }

    public void menu(Scanner scanner) {
        int choice = 0;

        do {
            System.out.println("\n--- LINKED LIST OPERATIONS ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
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
                    System.out.print("Enter number to insert: ");

                    if (scanner.hasNextInt()) {
                        insert(scanner.nextInt());
                    } else {
                        System.out.println("Invalid number!");
                        scanner.next();
                    }
                    break;

                case 2:
                    System.out.print("Enter number to delete: ");

                    if (scanner.hasNextInt()) {
                        delete(scanner.nextInt());
                    } else {
                        System.out.println("Invalid number!");
                        scanner.next();
                    }
                    break;

                case 3:
                    System.out.print("Enter number to search: ");

                    if (scanner.hasNextInt()) {
                        search(scanner.nextInt());
                    } else {
                        System.out.println("Invalid number!");
                        scanner.next();
                    }
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