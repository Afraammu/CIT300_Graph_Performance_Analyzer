
import java.util.Scanner;

public class QueueManager {

    private int[] queue = new int[100];
    private int front = 0;
    private int rear = -1;
    private int size = 0;

    public void enqueue(int value) {
        if (size == queue.length) {
            System.out.println("Queue is full!");
            return;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;

        System.out.println(value + " added to the queue.");
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return;
        }

        System.out.println("Removed element: " + queue[front]);
        front = (front + 1) % queue.length;
        size--;
    }

    public void peek() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("Front element: " + queue[front]);
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");

        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % queue.length] + " ");
        }

        System.out.println();
    }

    public void menu(Scanner scanner) {
        int choice = 0;

        do {
            System.out.println("\n--- QUEUE OPERATIONS ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. View Front");
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
                    System.out.print("Enter number to add: ");

                    if (scanner.hasNextInt()) {
                        enqueue(scanner.nextInt());
                    } else {
                        System.out.println("Invalid number!");
                        scanner.next();
                    }
                    break;

                case 2:
                    dequeue();
                    break;

                case 3:
                    peek();
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