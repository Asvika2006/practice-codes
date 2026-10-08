# Data Structures and Algorithms in Java

This repository contains my Java programs for learning and practicing
Data Structures and Algorithms.

All programs are written in a simple and beginner-friendly way.
Most programs use user input with Scanner.

---

## 📌 What are Data Structures?

A data structure is a way of storing and organizing data so that
we can use and modify it efficiently.

For example:

- Array → stores elements in continuous positions
- Linked List → stores elements using nodes and links
- Stack → follows LIFO
- Queue → follows FIFO

---

# 1. Arrays

An array stores multiple values of the same data type.

Example:

    int[] a = {10, 20, 30, 40};

Structure:

    Index:    0    1    2    3
              ↓    ↓    ↓    ↓
    Value:   10   20   30   40

The index starts from 0.

### Common Operations

- Insert
- Delete
- Search
- Update
- Display
- Find minimum/maximum

---

# 2. Searching

Searching means finding a particular element in a collection.

## 2.1 Linear Search

Linear Search checks each element one by one.

Example:

    10  20  30  40  50

Searching for 30:

    10 → 20 → 30

Time Complexity:

    O(n)

Linear Search can be used even when the array is not sorted.

---

## 2.2 Binary Search

Binary Search repeatedly divides a sorted array into two parts.

Example:

    10  20  30  40  50

Search for 40.

Middle element = 30

40 is greater than 30, so search the right half.

    40  50

Then 40 is found.

Important:

Binary Search requires a sorted array.

Time Complexity:

    O(log n)

---

# 3. Sorting

Sorting means arranging elements in a particular order.

Example:

Before:

    40  10  30  20

After ascending sorting:

    10  20  30  40

---

## 3.1 Bubble Sort

Bubble Sort compares adjacent elements and swaps them if they
are in the wrong order.

Example:

    30  20  10

First comparison:

    30 > 20

Swap:

    20  30  10

Continue until the largest element moves to the end.

Time Complexity:

    O(n²)

---

## 3.2 Selection Sort

Selection Sort finds the smallest element and places it in the
correct position.

Example:

    30  10  20

Smallest = 10

After first step:

    10  30  20

Then:

    10  20  30

Time Complexity:

    O(n²)

---

## 3.3 Insertion Sort

Insertion Sort takes one element at a time and places it in its
correct position.

Example:

    30  10  20

Take 10 and insert it before 30:

    10  30  20

Take 20:

    10  20  30

Time Complexity:

    O(n²)

---

# 4. Linked List

A Linked List stores data using nodes.

Each node contains:

    Data
    Next

Example:

    10 → 20 → 30 → null

Each node points to the next node.

A basic node contains:

    class Node {
        int data;
        Node next;
    }

---

# 5. Singly Linked List

A Singly Linked List has one link called `next`.

Structure:

    10 → 20 → 30 → null

The last node points to `null`.

### Operations

- Insert at beginning
- Insert at end
- Insert at position
- Delete at beginning
- Delete at end
- Delete at position
- Search
- Display
- Update

---

# 6. Doubly Linked List

A Doubly Linked List has two links:

- `prev`
- `next`

Structure:

    null ← 10 ⇄ 20 ⇄ 30 → null

Each node can move in both directions.

Node structure:

    class Node {
        int data;
        Node prev;
        Node next;
    }

### Advantages

- Forward traversal
- Backward traversal
- Easy deletion when the previous node is known

---

# 7. Circular Singly Linked List

In a Circular Singly Linked List, the last node points back to
the first node.

Normal Singly Linked List:

    10 → 20 → 30 → null

Circular Singly Linked List:

    10 → 20 → 30
    ↑         ↓
    └─────────┘

There is no `null` at the end.

The last node points to `head`.

Important condition:

    temp.next != head

Instead of:

    temp.next != null

---

# 8. Stack

A Stack follows:

    LIFO
    Last In, First Out

Example:

    10
    20
    30 ← Top

If we remove an element, 30 is removed first.

### Main Operations

## Push

Adds an element to the top.

    Push(40)

    40 ← Top
    30
    20
    10

## Pop

Removes the top element.

    40 ← removed
    30
    20
    10

## Peek

Shows the top element without removing it.

### Stack can be implemented using:

- Array
- Linked List

---

# 9. Queue

A Queue follows:

    FIFO
    First In, First Out

Example:

    First                 Last
      ↓                     ↓
    10 → 20 → 30 → 40

The first element is removed first.

### Main Operations

## Enqueue

Adds a new element at the Last.

Example:

    10 → 20 → 30

Enqueue 40:

    10 → 20 → 30 → 40

## Dequeue

Removes the First element.

    10 → 20 → 30 → 40

After dequeue:

    20 → 30 → 40

## Peek

Shows the First element without removing it.

### Queue can be implemented using:

- Array
- Linked List

---

# 10. First and Last in Queue

In this repository, Queue uses simple terms:

    First = first element
    Last  = last element

Example:

    10 → 20 → 30 → 40
    ↑              ↑
   First          Last

### Remember

    Enqueue → Add at Last

    Dequeue → Remove from First

    Peek → See First

---

# 11. Stack vs Queue

| Feature | Stack | Queue |
|---------|-------|-------|
| Principle | LIFO | FIFO |
| Add | Top | Last |
| Remove | Top | First |
| Main operation | Push | Enqueue |
| Remove operation | Pop | Dequeue |
| View operation | Peek | Peek |

### Easy way to remember

Stack:

    Last In → First Out

Queue:

    First In → First Out

---

# 12. Data Structure Comparison

| Data Structure | Main Concept |
|----------------|--------------|
| Array | Index based storage |
| Singly Linked List | One-way links |
| Doubly Linked List | Two-way links |
| Circular Linked List | Last points to First |
| Stack | LIFO |
| Queue | FIFO |

---

# 13. Time Complexity

Time complexity describes how the running time of an algorithm
changes as the input size increases.

Common complexities:

    O(1)      Constant
    O(log n)  Logarithmic
    O(n)      Linear
    O(n²)     Quadratic

Examples:

Linear Search:

    O(n)

Binary Search:

    O(log n)

Bubble Sort:

    O(n²)

Selection Sort:

    O(n²)

Insertion Sort:

    O(n²)

---

# 14. Technologies Used

- Java
- Visual Studio Code
- Git
- GitHub

---

# 15. Learning Approach

The programs in this repository are implemented step by step.

The learning order is:

    Arrays
       ↓
    Searching
       ↓
    Sorting
       ↓
    Singly Linked List
       ↓
    Doubly Linked List
       ↓
    Circular Linked List
       ↓
    Stack
       ↓
    Queue

---

# 16. Purpose of This Repository

The purpose of this repository is to:

- Learn Data Structures
- Practice Java programming
- Understand basic algorithms
- Improve problem-solving skills
- Practice user-input based programs
- Maintain my coding practice on GitHub

---

## Author

Asvika

This repository represents my learning and practice in
Data Structures and Algorithms using Java.
