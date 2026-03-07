# PalindromeCheckerApp

## Overview

PalindromeCheckerApp is a console-based Java application that checks whether a given string is a palindrome. The project is designed to strengthen core Java programming fundamentals, application flow control, and basic string handling concepts.

---

## Objective

The objective of the PalindromeCheckerApp is to:

- Design and implement a console-based Java application
- Validate whether a given string is a palindrome
- Demonstrate structured program flow
- Reinforce fundamental Java concepts
- Apply basic string manipulation logic

---

## Prerequisites

Ensure the following are installed on your system:

- Java JDK (version 8 or higher)
- Git

To verify Java installation:

```bash
java -version
```

---

## Installation and Execution

### Step 1: Clone the repository

```bash
git clone <https://github.com/AGENT47MARINE/PalindromeCheckerApp.git>
```

### Step 2: Navigate to the source directory

```bash
cd App/src
```

### Step 3: Compile the Java file

```bash
javac PalindromeCheckerApp.java
```

### Step 4: Run the application

```bash
java PalindromeCheckerApp
```

---

## Project Flow

- Program starts
- JVM invokes the `main()` method
- Application name is displayed
- Application version is displayed
- Program proceeds to the next use case or exits

---

## Topics Covered

### Class
Acts as a container for the Palindrome Checker application logic.

### Main Method
Entry point of the Java application:

```java
public static void main(String[] args)
```

### Static Keyword
Allows the JVM to invoke the `main()` method without creating an object.

### Console Output
Uses `System.out.println()` to display messages on the console.

### Application Flow Control
Defines the startup behavior before palindrome processing begins.

---

## Use Cases Implemented

### UC1: Application Entry and Welcome Message
- Displays application name
- Displays application version
- Confirms successful startup

### UC2: Hardcoded Palindrome Result
- Uses a predefined string
- Checks whether the string is a palindrome
- Displays the result

### UC3: Palindrome Check Using String Reverse
- Reverse string using loop
- Compare original and reversed
- Display result

### UC4: Character Array Based Palindrome Check
- Convert string to char[]
- Use two-pointer approach
- Compare start & end characters

### UC5:Stack-Based Palindrome Checker
- Push characters into stack
- Pop and compare
- Print result

### UC6:Demonstrate FIFO vs LIFO using Queue and Stack.
- Enqueue characters
- Push characters to stack
- Compare dequeue vs pop
---

**UC7: Deque-Based Optimized Palindrome Checker**

**Goal:** 

Use Deque to compare front and rear elements.

**Flow:**

1.Insert characters into deque

2.Remove first & last

3.Compare until empty

**Key Concepts used in UC7:**

Deque (Double Ended Queue) – A data structure that allows insertion and deletion from both front and rear ends.

Front and Rear Access – Enables direct comparison of first and last characters.

Optimized Data Handling – Eliminates the need for separate reversal data structures.

**Data Structure:** 

Deque


**UC8: Linked List Based Palindrome Checker**
-
**Goal:** 

Check palindrome using singly linked list.

**Flow:**

1.Convert string to linked list

2.Reverse second half

3.Compare halves

**Key Concepts used in UC8:**

Singly Linked List – A dynamic data structure where elements are connected using node references.

Node Traversal – Sequential access to elements using next references.

Fast and Slow Pointer Technique – Used to find the middle of the linked list efficiently.

In-Place Reversal – Reverses the second half of the list without extra memory.

**Data Structure:** 

Singly Linked List

**UC9: Recursive Palindrome Checker**
-
**Goal:** 

Check palindrome using recursion.

Flow:

1.Recursive call compares start & end

2.Base condition exits recursion

**Key Concepts used in UC9:**

Recursion – A technique where a method calls itself to solve smaller subproblems.

Base Condition – Prevents infinite recursion and terminates the recursive calls.

Call Stack – Memory structure used to manage method calls during recursion.

**Data Structure:** 

Call Stack

**UC10: Case-Insensitive & Space-Ignored Palindrome**
-

**Goal:**

Ignore spaces and case while checking a palindrome.

**Flow:**

1.Normalize string

2.Apply previous logic

**Key Concepts used in UC10:**

String preprocessing

Regular expressions

**Data Structure:**

String / Array




This project serves as a beginner-friendly Java application demonstrating program structure, execution flow, and basic string processing logic.
