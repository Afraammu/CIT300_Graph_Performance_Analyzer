
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayManager arrayManager = new ArrayManager();
        StackManager stackManager = new StackManager();
        QueueManager queueManager = new QueueManager();
        LinkedListManager linkedListManager = new LinkedListManager();
        SearchingManager searchingManager = new SearchingManager();
        GraphManager graphManager = new GraphManager();
        PerformanceManager performanceManager = new PerformanceManager();

        int choice = 0;

        do {
            System.out.println("\n=========================================");
            System.out.println("   DATA STRUCTURE & GRAPH ANALYZER");
            System.out.println("=========================================");
            System.out.println("1. Array Operations");
            System.out.println("2. Stack Operations");
            System.out.println("3. Queue Operations");
            System.out.println("4. Linked List Operations");
            System.out.println("5. Searching Operations");
            System.out.println("6. Graph Operations");
            System.out.println("7. Performance Comparison");
            System.out.println("8. Display All Results");
            System.out.println("9. Exit");
            System.out.println("=========================================");
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
                continue;
            }

            switch (choice) {
                case 1:
                    arrayManager.menu();
                    break;

                case 2:
                    stackManager.menu(scanner);
                    break;

                case 3:
                    queueManager.menu(scanner);
                    break;

                case 4:
                    linkedListManager.menu(scanner);
                    break;

                case 5:
                    searchingManager.menu(scanner);
                    break;

                case 6:
                    graphManager.menu(scanner);
                    break;

                case 7:
                    performanceManager.menu(scanner);
                    break;

                case 8:
                    System.out.println("\n========== ARRAY RESULTS ==========");
                    arrayManager.display();

                    System.out.println("\n========== LINKED LIST RESULTS ==========");
                    linkedListManager.display();

                    System.out.println("\n========== SEARCHING NUMBERS ==========");
                    searchingManager.display();

                    System.out.println("\n========== GRAPH RESULTS ==========");
                    graphManager.displayGraph();

                    System.out.println(
                        "\nUse Stack and Queue menus to view their elements."
                    );
                    break;

                case 9:
                    System.out.println(
                        "Thank you for using Data Structure & Graph Analyzer!"
                    );
                    break;

                default:
                    System.out.println(
                        "Invalid choice! Enter a number from 1 to 9."
                    );
            }

        } while (choice != 9);

        scanner.close();
    }
}