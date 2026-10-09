
import java.util.*;

public class GraphManager {

    private Map<Integer, List<Integer>> graph = new LinkedHashMap<>();

    public void addVertex(int vertex) {
        if (graph.containsKey(vertex)) {
            System.out.println("Vertex already exists.");
            return;
        }

        graph.put(vertex, new ArrayList<>());
        System.out.println("Vertex " + vertex + " added successfully.");
    }

    public void addEdge(int source, int destination) {
        if (!graph.containsKey(source) || !graph.containsKey(destination)) {
            System.out.println("Both vertices must exist before adding an edge.");
            return;
        }

        if (graph.get(source).contains(destination)) {
            System.out.println("Edge already exists.");
            return;
        }

        graph.get(source).add(destination);
        graph.get(destination).add(source);

        System.out.println("Edge added between " + source + " and " + destination + ".");
    }

    public void displayGraph() {
        if (graph.isEmpty()) {
            System.out.println("Graph is empty.");
            return;
        }

        System.out.println("\nGraph Representation:");

        for (int vertex : graph.keySet()) {
            System.out.println(vertex + " -> " + graph.get(vertex));
        }
    }

    public void bfs(int start) {
        if (!graph.containsKey(start)) {
            System.out.println("Starting vertex does not exist.");
            return;
        }

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int neighbour : graph.get(vertex)) {
                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }

        System.out.println();
    }

    public void dfs(int start) {
        if (!graph.containsKey(start)) {
            System.out.println("Starting vertex does not exist.");
            return;
        }

        Set<Integer> visited = new HashSet<>();

        System.out.print("DFS Traversal: ");
        dfsVisit(start, visited);
        System.out.println();
    }

    private void dfsVisit(int vertex, Set<Integer> visited) {
        visited.add(vertex);
        System.out.print(vertex + " ");

        for (int neighbour : graph.get(vertex)) {
            if (!visited.contains(neighbour)) {
                dfsVisit(neighbour, visited);
            }
        }
    }

    public void menu(Scanner scanner) {
        int choice = 0;

        do {
            System.out.println("\n--- GRAPH OPERATIONS ---");
            System.out.println("1. Add Vertex");
            System.out.println("2. Add Edge");
            System.out.println("3. Display Graph");
            System.out.println("4. Breadth-First Search (BFS)");
            System.out.println("5. Depth-First Search (DFS)");
            System.out.println("6. Return to Main Menu");
            System.out.print("Enter choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                scanner.next();
                continue;
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter vertex number: ");

                    if (scanner.hasNextInt()) {
                        addVertex(scanner.nextInt());
                    } else {
                        System.out.println("Invalid vertex!");
                        scanner.next();
                    }
                    break;

                case 2:
                    System.out.print("Enter source vertex: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid vertex!");
                        scanner.next();
                        break;
                    }

                    int source = scanner.nextInt();

                    System.out.print("Enter destination vertex: ");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid vertex!");
                        scanner.next();
                        break;
                    }

                    int destination = scanner.nextInt();
                    addEdge(source, destination);
                    break;

                case 3:
                    displayGraph();
                    break;

                case 4:
                    System.out.print("Enter starting vertex for BFS: ");

                    if (scanner.hasNextInt()) {
                        bfs(scanner.nextInt());
                    } else {
                        System.out.println("Invalid vertex!");
                        scanner.next();
                    }
                    break;

                case 5:
                    System.out.print("Enter starting vertex for DFS: ");

                    if (scanner.hasNextInt()) {
                        dfs(scanner.nextInt());
                    } else {
                        System.out.println("Invalid vertex!");
                        scanner.next();
                    }
                    break;

                case 6:
                    System.out.println("Returning to main menu...");
                    break;

                default:
                    System.out.println("Invalid choice! Enter 1 to 6.");
            }

        } while (choice != 6);
    }
}