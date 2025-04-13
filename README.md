# Custom List Implementations in Java

This project is  focused on implementing custom data structures in Java without using Java's built-in collection classes (except `Iterator`). The main goal is to implement and test custom versions of `ArrayList` and `LinkedList`, followed by logical data structures based on them.

---

##  Project Structure

###  1. `MyList<T>`
An interface that defines all methods a custom list should support.  
Implemented by both `MyArrayList<T>` and `MyLinkedList<T>`.

###  2. `MyArrayList<T>`
A custom dynamic array implementation.  
Supports:
- `add`, `remove`, `get`, `size`
- `sort`, `indexOf`, `lastIndexOf`, `exists`
- `toArray`, `clear`, `iterator`

###  3. `MyLinkedList<T>`
A custom doubly linked list implementation.  
Supports:
- `add`, `remove`, `get`, `size`
- `sort`, `indexOf`, `lastIndexOf`, `exists`
- `toArray`, `clear`, `iterator`

###  4. `Main.java`
A demo/testing class that:
- creates and manipulates both `MyArrayList` and `MyLinkedList`
- sorts, removes, searches for elements
- prints the list contents

---


## 📦 Features Implemented

-  Full interface-based list design
-  Custom `ArrayList` and `LinkedList` from scratch
-  No use of `java.util.*` (except `Iterator`)
-  Sorting using `Comparable<T>`
-  Iterator support for enhanced `for` loops
- GitHub with 7 commits
-  In-code documentation for clarity

---

##  Technologies Used


- IntelliJ IDEA
- Git / GitHub

---

## 📁 Future Work

- Implementation of `MyStack`, `MyQueue`, and `MyMinHeap` based on physical structures
- Full implementation of all methods like `addFirst`, `getLast`, etc.


---

## Kuzhentayeva  Ramina SE-2406



