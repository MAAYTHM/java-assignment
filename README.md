# Java Assignmet - Calulator
## Description
This repository contains a simple Java program called `Calculator.java`. It is an assignment for my Java class, designed to perform basic arithmetic operations such as addition, subtraction, multiplication, and division.

## Features
- Addition of two numbers
- Subtraction of two numbers
- Multiplication of two numbers
- Division of two numbers with error handling for division by zero

## Development
The program was developed using GitHub Copilot, which assisted in generating the code efficiently. The repository was managed using Git CLI for version control and GitHub web interface for collaboration and repository management.

## How to Run
1. Clone the repository:
    ```bash
    git clone https://github.com/MAAYTHM/java-assignment.git
    ```
2. Navigate to the project directory:
    ```bash
    cd java-assignment
    ```
3. Compile the program:
    ```bash
    javac Calculator.java
    ```
4. Run the program:
    ```bash
    java Calculator
    ```
5. Compile the test script `Calculator.java`:
    ```bash
    javac -cp ".;.\jars\junit-platform-console-standalone-1.9.3.jar;.\jars\junit-jupiter-api-5.8.0.jar;.\jars\junit-jupiter-engine-5.8.0.jar;.\jars\apiguardian-api-1.1.2.jar" CalculatorTest.java
    ```
6. Run the test script:
    ```bash
    java -cp ".;.\jars\junit-platform-console-standalone-1.9.3.jar" org.junit.platform.console.ConsoleLauncher --select-class CalculatorTest
    ```

## Files
- `Calculator.java`: The main Java file containing the calculator implementation.
- `CalculatorTest.java`: A JUnit test file that contains unit tests for verifying the functionality of the `Calculator.java` program.

## License
This project is for educational purposes and does not include a specific license.

## Acknowledgments
Special thanks to GitHub Copilot for assisting in the development of this program.

## Example Output
Below is an example of how the program works:

```
=== Calculator ===
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Modulus
6. Power
7. Square Root
8. Exit
Choose an operation: 6
Enter base number: 1337
Enter exponent: 2
Result: 1787569.0

=== Calculator ===
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Modulus
6. Power
7. Square Root
8. Exit
Choose an operation: 8
Exiting the calculator. Goodbye!
```

## Example Test Output
Below is an example output of running `CalculatorTest.java`:

```
.
+-- JUnit Jupiter [OK]
| '-- CalculatorTest [OK]
|   +-- testSquareRootOfNegativeNumber() [OK]
|   +-- testPower() [OK]
|   +-- testMultiplication() [OK]
|   +-- testAddition() [OK]
|   +-- testDivisionByZero() [OK]
|   +-- testModulus() [OK]
|   +-- testDivision() [OK]
|   +-- testSquareRoot() [OK]
|   '-- testSubtraction() [OK]
+-- JUnit Vintage [OK]
'-- JUnit Platform Suite [OK]

Test run finished after 120 ms
[         4 containers found      ]
[         0 containers skipped    ]
[         4 containers started    ]
[         0 containers aborted    ]
[         4 containers successful ]
[         0 containers failed     ]
[         9 tests found           ]
[         0 tests skipped         ]
[         9 tests started         ]
[         0 tests aborted         ]
[         9 tests successful      ]
[         0 tests failed          ]
```