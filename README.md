# GPA Calculator

This repository contains two efficient and user-friendly implementations of a GPA Calculator: one in **Java** and one in **Python**. Both implementations support unweighted and weighted GPA calculations based on user-provided course grades, credits, and difficulty levels.

## Features

- **Dual Implementations**: Choose between Java and Python, depending on your preferences and development environment.
  
- **Unweighted and Weighted GPA**: Calculates both unweighted and weighted GPAs, with customizable grade and level scaling.

- **Input Validation**: Both implementations handle user input carefully, ensuring only valid grades, credits, and levels are accepted.

- **Customizable Grading Scale**: Easily modify the grade-to-point mapping to suit different educational systems.

---

## File Overview

- `GPACalculator.java`: Java implementation of the GPA Calculator.

- `gpa_calculator.py`: Python implementation of the GPA Calculator.

---

## Usage Guide

### Prerequisites

- **Java Version**: Ensure the [JDK](https://www.oracle.com/java/technologies/javase-downloads.html) is installed on your system.

- **Python Version**: Install Python [3.x](https://www.python.org/downloads/) on your system.

---

### Java Implementation

1. **Compile the Java Program**:
   ```bash
   javac GPACalculator.java
   ```
2. **Run the Program**:
   ```bash
   java GPACalculator
   ```
3. **Interactive Input Example**:
   - Enter the number of courses.
	 - Provide the grade (e.g., A, B+), credit hours (e.g., 3), and difficulty level (e.g., H for Honors) for each course.
4. **Output**:
   The program calculates and displays both unweighted and weighted GPAs:
   ```
   Your unweighted GPA is: 3.85
   Your weighted GPA is: 4.15
   ```

---

### Python Implementation

1. **Run the Python Script**:
   ```bash
   python gpa_calculator.py
   ```
2. **Interactive Input Example**:
   - Enter the number of courses.
	 - Provide the grade (e.g., A, B+), credit hours (e.g., 3), and difficulty level (e.g., H for Honors) for each course.
3. **Output**:
   The program calculates and displays both unweighted and weighted GPAs:
   ```
   Your unweighted GPA is: 3.85
   Your weighted GPA is: 4.15
   ```

---

## Customization

### Modifying the Grading Scale

Both versions use the following default grading scale:

| Grade | Points |
|-------|--------|
| A+    | 4.33   |
| A     | 4.00   |
| A-    | 3.67   |
| B+    | 3.33   |
| B     | 3.00   |
| B-    | 2.67   |
| C+    | 2.33   |
| C     | 2.00   |
| C-    | 1.67   |
| D     | 1.00   |
| F     | 0.00   |

- **Java**: Update the getValue method in `GPACalculator.java` to reflect the new grading scale.

- **Python**: Modify the getValue function in `gpa_calculator.py`.
