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

---

This project serves as a beginner-friendly Java application demonstrating program structure, execution flow, and basic string processing logic.