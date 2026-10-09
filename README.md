# Data Structure and Graph Performance Analyzer

## 1. Project Description

The Data Structure and Graph Performance Analyzer is a Java-based console application developed for the CIT300 – Data Structures and Algorithms module.

The main objective of this project is to demonstrate the practical implementation of fundamental data structures, searching algorithms, graph operations, graph traversal techniques, and algorithm performance comparison.

The application provides a menu-driven interface that allows users to perform different operations and observe how data structures and algorithms work.

## 2. Project Objectives

* To implement and understand fundamental data structures.
* To perform insertion, deletion, searching, and display operations.
* To implement Linear Search and Binary Search.
* To represent graphs using an adjacency list.
* To perform Breadth-First Search (BFS) and Depth-First Search (DFS).
* To compare the performance of searching algorithms.
* To apply Object-Oriented Programming (OOP) principles.
* To implement input validation and basic error handling.
* To collaborate using Git and GitHub.

## 3. Main Features

### 3.1 Array Operations

* Insert elements into an array.
* Delete elements from an array.
* Search for an element.
* Display array elements.

### 3.2 Stack Operations

* Push an element onto the stack.
* Pop an element from the stack.
* Peek at the top element.
* Display stack elements.

### 3.3 Queue Operations

* Enqueue an element.
* Dequeue an element.
* Peek at the front element.
* Display queue elements.

### 3.4 Linked List Operations

* Insert a new node.
* Delete a node by value.
* Search for a value.
* Display all nodes.

### 3.5 Searching Algorithms

* Linear Search.
* Binary Search.
* Display stored numbers.
* Compare the number of steps required by the searching algorithms.

### 3.6 Graph Operations

* Add vertices.
* Add edges between vertices.
* Display the graph.
* Perform Breadth-First Search (BFS).
* Perform Depth-First Search (DFS).

### 3.7 Performance Comparison

* Compare Linear Search and Binary Search.
* Count the steps performed by each algorithm.
* Measure execution time.
* Display the results for analysis.

### 3.8 Input Validation

* Validate menu choices.
* Handle invalid non-numeric menu input.
* Display error messages for invalid choices.
* Handle empty stack and queue conditions.

## 4. Technologies Used

* **Programming Language:** Java
* **Development Environment:** Visual Studio Code
* **Version Control System:** Git
* **Code Hosting Platform:** GitHub
* **Application Type:** Console-Based Application

## 5. Project Structure

```text
CIT300_Graph_Performance_Analyzer/
│
├── Main.java
├── ArrayManager.java
├── StackManager.java
├── QueueManager.java
├── LinkedListManager.java
├── SearchingManager.java
├── GraphManager.java
├── PerformanceManager.java
├── README.md
└── .gitignore
```

### File Descriptions

* **Main.java** – Displays the main menu and coordinates the application.
* **ArrayManager.java** – Implements array insertion, deletion, searching, and display operations.
* **StackManager.java** – Implements stack operations using an array.
* **QueueManager.java** – Implements queue operations using a circular array.
* **LinkedListManager.java** – Implements linked list operations using nodes.
* **SearchingManager.java** – Implements Linear Search and Binary Search.
* **GraphManager.java** – Implements graph operations, BFS, and DFS.
* **PerformanceManager.java** – Compares the performance of searching algorithms.
* **README.md** – Contains project documentation.
* **.gitignore** – Excludes compiled Java class files and the VS Code settings folder.

## 6. How to Run the Application

### Prerequisites

* Install the Java Development Kit (JDK).
* Install Visual Studio Code or another Java-compatible development environment.
* Ensure that Git is installed if you want to work with the repository.

### Steps

1. Open the project folder in Visual Studio Code.

2. Open the terminal inside the project folder.

3. Compile all Java source files:

   ```bash
   javac *.java
   ```

4. Run the application:

   ```bash
   java Main
   ```

5. Select an option from the main menu.

6. Follow the displayed instructions to perform the required operations.

7. Select Exit to close the application.

## 7. Main Menu

The application provides the following main menu options:

1. Array Operations
2. Stack Operations
3. Queue Operations
4. Linked List Operations
5. Searching Operations
6. Graph Operations
7. Performance Comparison
8. Display All Results
9. Exit

## 8. Algorithm Complexity

The following table shows the typical time complexity of the implemented operations.

| Operation                    | Typical Time Complexity |
| ---------------------------- | ----------------------- |
| Array access by index        | O(1)                    |
| Array search                 | O(n)                    |
| Stack push                   | O(1)                    |
| Stack pop                    | O(1)                    |
| Queue enqueue                | O(1)                    |
| Queue dequeue                | O(1)                    |
| Linked list search           | O(n)                    |
| Linked list insertion at end | O(n)                    |
| Linear Search                | O(n)                    |
| Binary Search                | O(log n)                |
| Graph BFS                    | O(V + E)                |
| Graph DFS                    | O(V + E)                |

**Note:** Actual performance depends on the implementation, data size, and input. Binary Search requires sorted data. The Linked List insertion complexity shown here assumes insertion at the end without a maintained tail pointer.

Where:

* **n** = number of elements.
* **V** = number of vertices.
* **E** = number of edges.

## 9. Performance Analysis

The Performance Comparison module compares Linear Search and Binary Search using a sorted set of integer values.

Linear Search checks elements one by one until the target is found or the list ends. Binary Search repeatedly divides the sorted search range into smaller sections.

For larger sorted datasets, Binary Search generally requires fewer search steps than Linear Search. The application displays the measured results to help users understand the difference between the algorithms.

Execution time can vary depending on the computer, Java runtime, and system load. Therefore, the number of search steps is also useful for comparing algorithm efficiency.

## 10. Object-Oriented Programming

The project separates the operations into individual Java classes. This makes the code easier to understand, maintain, test, and extend.

Each manager class is responsible for a particular data structure or algorithm. The `Main` class provides the main menu and coordinates the different modules.

## 11. Input Validation and Error Handling

The application includes basic input validation to reduce errors during execution.

Examples include:

* Checking whether the main menu input is numeric.
* Rejecting menu choices outside the valid range.
* Displaying messages when a stack or queue is empty.
* Providing instructions when users enter invalid menu choices.

## 12. Group Members and Contributions

| Member Name | Student ID | Contribution                                                       |
| ----------- | ---------- | ------------------------------------------------------------------ |
| Afra        | 23DA2-0992 | Array Operations and Searching Algorithms                          |
| Aslam       | 23DA2-0771 | Stack and Queue Operations                                         |
| Nuha        | 23DA2-0988 | Linked List Operations                                             |
| Aksha       | 23DA2-1103 | Graph Operations, BFS, DFS, Performance Comparison and Integration |

*Note: Update the contribution descriptions if the actual work distribution differs.*

## 13. GitHub Repository

The project source code and documentation are maintained using Git and GitHub.

Repository: https://github.com/Afraammu/CIT300_Graph_Performance_Analyzer

Git is used to track changes, while GitHub hosts the project files and supports collaboration.

## 14. Testing

The application should be tested using the following cases:

* Insert, display, search, and delete array elements.
* Push, pop, and peek stack elements.
* Enqueue and dequeue queue elements.
* Insert, search, and delete linked list nodes.
* Test Linear Search and Binary Search with existing and missing values.
* Add graph vertices and edges, then test BFS and DFS.
* Compare searching performance for different dataset sizes.
* Enter invalid menu values and confirm that appropriate messages appear.
* Test empty stack and queue conditions.

## 15. Conclusion

The Data Structure and Graph Performance Analyzer demonstrates the practical use of fundamental data structures and algorithms through a menu-driven Java application.

It provides opportunities to explore arrays, stacks, queues, linked lists, searching algorithms, graph representations, graph traversal, and performance comparison.

The project also applies basic Object-Oriented Programming, input validation, and GitHub version control. It helps students develop a better understanding of data structure operations and algorithm efficiency.

## 16. Course Details

* **Module Code:** CIT300
* **Module Name:** Data Structures and Algorithms
* **Project Title:** Data Structure and Graph Performance Analyzer
* **Programming Language:** Java
* **Academic Institution:** Sri Lanka Technological Campus (SLTC)

