
public class StackManager {

    private int[] stack = new int[100];
    private int top = -1;

    // Push an element onto the stack
    public void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full!");
            return;
        }

        stack[++top] = value;
        System.out.println(value + " pushed onto the stack.");
    }

    // Remove the top element
    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty! Cannot pop.");
            return;
        }

        System.out.println("Popped element: " + stack[top--]);
    }

    // View the top element
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }

        System.out.println("Top element: " + stack[top]);
    }

    // Display all elements
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack elements (top to bottom):");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    // Stack submenu
    public void menu(java.util.Scanner scanner) {
        int choice;

        do {
            System.out.println("\n--- STACK OPERATIONS ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            System.out.print("Enter choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                scanner.next();
                System.out.print("Enter choice: ");
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number to push: ");
                    if (scanner.hasNextInt()) {
                        push(scanner.nextInt());
                    } else {
                        System.out.println("Invalid number!");
                        scanner.next();
                    }
                    break;

                case 2:
                    pop();
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